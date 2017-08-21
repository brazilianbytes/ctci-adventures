package com.brazilianbytes.ctci.algorithm.sort.selection;

import java.util.Comparator;

import com.brazilianbytes.ctci.algorithm.sort.SortInterface;
import com.brazilianbytes.ctci.algorithm.sort.Util;

public final class Selection implements SortInterface {
	
	@Override
	public <T> void sort(T[] array, Comparator<T> comparator) {
		
		int smaller;
		
		for (int limit = 0; limit < array.length; limit++) {

			smaller = limit;
			
			for (int actual = limit; actual < array.length; actual++) {

				if  (comparator.compare(array[smaller], array[actual]) == 1) {
					smaller = actual;
				}
			}
			
			Util.swap(array, smaller, limit);
		}
	}

}
