package com.brazilianbytes.ctci.algorithm.sort.bubble;

import java.util.Comparator;

import com.brazilianbytes.ctci.algorithm.sort.ISort;

public class Bubble implements ISort {

	@Override
	public <T> void sort(T[] array, Comparator<T> comparator) {

		T temp;
		int left;

		for (int limit = 0; limit < array.length; limit++) {

			for (int right = array.length-1; right > 0; right--) {

				left = right - 1;

				if (comparator.compare(array[left], array[right]) == 1) {

					temp = array[left];
					array[left] = array[right];
					array[right] = temp;
				}

			}
		}
	}
}
