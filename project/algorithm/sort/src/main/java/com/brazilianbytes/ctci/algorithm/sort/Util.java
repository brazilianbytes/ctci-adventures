package com.brazilianbytes.ctci.algorithm.sort;

public final class Util {
	
	private Util() {
	}
	
	/**
	 * Swap Array items
	 * 
	 * @param array
	 * @param src
	 * @param dest
	 */
	public static <T extends Object> void swap(T[] array, int src, int dest) {
		
		T temp = array[src];
		array[src] = array[dest];
		array[dest] = temp;
	}
}
