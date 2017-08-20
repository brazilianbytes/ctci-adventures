package com.brazilianbytes.ctci.algorithm.sort;

import java.util.Comparator;

public interface ISort {
	
	public default <T extends Object> void sort(T[] array, Comparator<T> comparator) {
		throw new UnsupportedOperationException();
	}
}
