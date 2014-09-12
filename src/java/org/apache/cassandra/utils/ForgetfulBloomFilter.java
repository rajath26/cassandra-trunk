package org.apache.cassandra.utils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Collections;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.ScheduledFuture;
//import java.util.concurrent.ScheduledThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;

import org.apache.cassandra.utils.FilterFactory;
import org.apache.cassandra.utils.IFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * A Forgetful Bloom Filter
 * @author rajatsub
 *
 */
public class ForgetfulBloomFilter {
	
	private static final Logger logger = LoggerFactory.getLogger(ForgetfulBloomFilter.class);
	
	// Defaults
	private static final int FUTURE = 0;
	private static final int PRESENT = 1;
	private static final int PASTSTART = 2;
	private static final int multiplicativeBloomFilterIncrement = 2;
	private static final int additiveBloomFilterDecrement = 1;
	private static final int additiveRefreshRateDecrement = 1;
	private static final int additiveRefreshRateIncrement= 1;
	private static final long defaultNumElements = 12500;
	private static final double defaultMaxFpp = 0.001;
	private static final int minRefreshRate = 1;
	private static final int minimumNumberOfBFs = 3;
	private static final double thresholdFraction = 0.8;
	private static final double safeThresholdFraction = 0.5;
	
	// List of bloom filters
	private List<IFilter> FBF = Collections.synchronizedList(new ArrayList<IFilter>());
	// Refresh rate
	private long refreshRate;	
	// False positive probability to tolerate
	private double maxTolerableFPP;
	
	//private static final ScheduledThreadPoolExecutor FBFThreads = new ScheduledThreadPoolExecutor(2);
	//private ScheduledExecutorService backgroundExecutors = Executors.newScheduledThreadPool(4);
	//private ScheduledFuture FBFThreadScheduler;
	
	/**
	 * Constructor
	 * Creates the FBF and starts the threads for FBF refresh and dynamic resizing
	 * 
	 * @param number of bloom filters in the FBF
	 * @param maximum tolerable false positive probability of the FBF
	 */
	public ForgetfulBloomFilter(int numberOfBFs,
			             long refreshTime, 
			             double appProvidedFPP) {
		assert numberOfBFs >= minimumNumberOfBFs;
		assert refreshRate >= minRefreshRate;
		assert appProvidedFPP < 1.0;
		refreshRate = refreshTime;
		maxTolerableFPP = appProvidedFPP;
		// Create the set of bloom filters
		for ( int counter = 0; counter < numberOfBFs; counter++ ) {
			FBF.add(addBloomFilter());
		}	
		logger.info("FBF created");
		/**
		 * An anonymous class that implements Runnable interface to start FBF refresh
		 */
		Runnable refreshFBF = new Runnable() {
			public void run() {
				while (true) {
					long delay = getRefreshRate();
					try { 
					    Thread.sleep(delay);
					} 
					catch (InterruptedException e) {
						logger.error("Refreshing FBF thread interrupted");
					}
				    refresh();
				}
			}
		};	
		/**
		 * An anonymous class the implements Runnable interface to perform dynamic resizing
		 */
		Runnable dynamicResizingFBF = new Runnable() {
			public void run() {
				while(true) { 
				    checkEffectiveFPP();
				}
			}
		};	
		//FBFThreadScheduler = backgroundExecutors.scheduleWithFixedDelay(refreshFBF, 5, refreshRate, TimeUnit.SECONDS);
		// Start the FBF refresh thread
		Thread refreshThread = new Thread(refreshFBF, "REFRESH-FBF");
		refreshThread.start();
		logger.info("Started the FBF refresh thread");
		// Start the dynamic resizing thread
		Thread dynamicResizingThread = new Thread(dynamicResizingFBF, "DYNAMIC-RESIZING");
		dynamicResizingThread.start();
		logger.info("Started the dynamic resizing thread");
	} // End of constructor
	
	/**
	 * This function returns a new bloom filter
	 * 
	 * @return A new bloom filter
	 */
	public IFilter addBloomFilter() {
		return FilterFactory.getFilter(defaultNumElements, defaultMaxFpp, true);
	}
	
	/**
	 * Return the last past bloom filter. Synchronization is caller's responsibility
	 *  
	 * @return past end bloom filter
	 */
	public int getPastEnd() { 
		return FBF.size() - 1;
	}
	
	/**
	 * Return the current refresh rate. Synchronization is caller's repsonsibility
	 * 
	 * @return current refresh rate of the FBF
	 */
	public long getRefreshRate() {
		return refreshRate;
	}
	
	/**
	 * Function to insert into the FBF. Insertions are made into: 
	 * i) Future bloom filter - 0
	 * ii) Present bloom filter - 1
	 * 
	 * @param Key to be inserted 
	 */
	public void insert(ByteBuffer key) {
	  synchronized(FBF) {
		  FBF.get(FUTURE).add(key);
		  FBF.get(PRESENT).add(key);
	  }
	} 
	
	/**
	 * Function to refresh FBF
	 * Remove the past end bloom filter and add new future. 
	 */
	public void refresh() {
		synchronized(FBF) {
			FBF.remove(getPastEnd());
			FBF.add(FUTURE, addBloomFilter());
		}
	} 

    /**
     * Function to return the effective false positive probability of the FBF
     * 
     * @return effective false positive probability of the FBF
     */
	public double returnEffectiveFPP() {
		double effectiveFPP = 0.0;
		int temp;
		effectiveFPP = ((BloomFilter) FBF.get(FUTURE)).effectiveFpp() * ((BloomFilter) FBF.get(PRESENT)).effectiveModifiedFpp();
		for ( int counter = PRESENT; counter < getPastEnd(); counter++ ) {
			temp = counter + 1;
			effectiveFPP += ((BloomFilter) FBF.get(counter)).effectiveModifiedFpp() * ((BloomFilter) FBF.get(temp)).effectiveModifiedFpp(); 
		}
		effectiveFPP += ((BloomFilter) FBF.get(getPastEnd())).effectiveModifiedFpp();
		return effectiveFPP;
	}
	
	/**
	 * Function to trigger dynamic resizing or trim down
	 */
	public void checkEffectiveFPP() {
	    double currentFPP = returnEffectiveFPP();	
	    if ( currentFPP >= thresholdFraction * maxTolerableFPP ) {
	    	dynamicResizing();
	    }
	    else if ( currentFPP <= safeThresholdFraction * maxTolerableFPP ) {
	    	triggerTrimDown();
	    }
	}
	
	/**
	 * Dynamic resizing function 
	 */
	public void dynamicResizing() {
		synchronized(FBF) {
			for ( int counter = FBF.size(); counter < FBF.size() * multiplicativeBloomFilterIncrement; counter++ ) {
				FBF.add(addBloomFilter());
			}
			if ( refreshRate > minRefreshRate ) {
				refreshRate -= additiveRefreshRateDecrement;
			}
		}
	}
	
	/**
	 * Dynamic trim down function 
	 */
	public void triggerTrimDown() {
		synchronized(FBF) {
			if ( FBF.size() > (minimumNumberOfBFs + additiveBloomFilterDecrement) ) {
				int index = getPastEnd();
				for ( int counter = 0; counter < additiveBloomFilterDecrement; counter++ ) {
					FBF.remove(index);
					index--;
				}
			}
			refreshRate += additiveRefreshRateIncrement;
		}
	}
	
	/**
	 * This function does membership check in the FBF
	 * 
	 * @param key to be searched
	 * @return boolean if the key is found or not
	 */
	public boolean membershipCheck(ByteBuffer key) {
	  	boolean isMember = false;
	  	boolean found = false;
		if ( FBF.get(FUTURE).isPresent(key) && FBF.get(PRESENT).isPresent(key) ) {
			isMember = true;
		}
		else if ( FBF.get(PRESENT).isPresent(key) && FBF.get(PASTSTART).isPresent(key) ) {
			isMember = true;
		}
		else if ( getPastEnd() > PASTSTART ) {
			for ( int j = PASTSTART; j < getPastEnd(); j++ ) {
				if ( FBF.get(j).isPresent(key) && FBF.get(j+1).isPresent(key) ) {
					isMember = true;
					found = true;
				}
				if ( true == found ) {
					break;
				}
			}
		}
		else if ( FBF.get(getPastEnd()).isPresent(key) ) {
			isMember = true;
		}
	  	return isMember;
	}
	
} // End of class
 