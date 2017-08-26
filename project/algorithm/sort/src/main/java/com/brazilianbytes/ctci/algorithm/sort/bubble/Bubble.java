package com.brazilianbytes.ctci.algorithm.sort.bubble;

import java.util.Comparator;

import com.brazilianbytes.ctci.algorithm.sort.SortInterface;
import com.brazilianbytes.ctci.algorithm.sort.Util;

/**
 * My implementation of 'Bubble Sort'
 * Big O: <wip>
 * 
 * @author luciano
 *
 */
public final class Bubble implements SortInterface {

	@Override
	public <T> void sort(T[] array, Comparator<T> comparator) {

		int left;

		for (int limit = 0; limit < array.length; limit++) {

			for (int right = array.length - 1; right > 0; right--) {

				left = right - 1;

				if (comparator.compare(array[left], array[right]) == 1) {

					Util.swap(array, left, right);
				}

			}
		}
	}
}
