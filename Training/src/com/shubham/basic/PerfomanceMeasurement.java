package com.shubham.basic;

import java.awt.List;
import java.util.ArrayList;

public class PerfomanceMeasurement {
	  private static final long MEGABYTE = 1024L * 1024L;
	  public static long bytesToMegabytes(long bytes) {
	        return bytes / MEGABYTE;
	    }
	  /**
	 * @param args
	 */
	public static void main(String[] args) {
	        // I assume you will know how to create a object Person yourself...
	        
	        // Get the Java runtime
	        Runtime runtime = Runtime.getRuntime();
	        // Run the garbage collector
	        runtime.gc();
	        // Calculate the used memory
	        long memory = runtime.totalMemory() - runtime.freeMemory();
	        System.out.println("Used memory is bytes: " + memory);
	        System.out.println("Used memory is megabytes: "
	                + bytesToMegabytes(memory));
	        long total=runtime.totalMemory()/1024/1024;
	        long max=runtime.maxMemory()/1024/1024;
	        long free=runtime.freeMemory()/1024/1024;
	        System.out.println("Mem All:- "+total+"mb approx");
	        System.out.println("Max Mem available "+ max+ "mb approx");
	        System.out.println("free mem " +free+ "mb approx");
	        System.out.println("Mem used " +(total-free)+ "mb approx");
	    }
}
