package com.brazilianbytes.ctci.algorithm.sort.insertion;

import java.util.Comparator;

import com.brazilianbytes.ctci.algorithm.sort.SortInterface;

/**
 * My implementation of 'Insertion Sort'
 * Big O: <wip>
 * 
 * @author luciano
 *
 */
public class Insertion implements SortInterface {

	@Override
	public <T> void sort(final T[] array, final Comparator<T> comparator) {

		for (int position = 1; position < array.length; position++) {

			int already = position;

			if  (lessThen(array[position], array[already-1])) {
				
				for (; already > 0; already--) {
					if  (greaterThen(array[position], array[already-1])) {
						break;
					}
				}
			}
			
			if  (position != already) {
				moveItemFromTo(array, position, already);
			}
		}
	}

	/*
	 * Just for improve code reading
	 */
	private <T> boolean greaterThen(final T x, final T y) {
		
		return Integer.compare((Integer) x, (Integer) y) > 0;
	}

	/*
	 * Just for improve code reading
	 */
	private <T> boolean lessThen(final T x, final T y) {
		
		return Integer.compare((Integer) x, (Integer) y) < 0;
	}

	/*
	 * Just for improve code reading
	 */
	private <T> void moveItemFromTo(final T[] array, final int from, final int to) {

		final T temp = array[from];

		System.arraycopy(array, to, array, to + 1, from - to);
		
		array[to] = temp;
	}
}
