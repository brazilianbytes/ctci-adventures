package com.brazilianbytes.ctci.algorithm.sort;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SortFixedTest {

	private static final Integer[] ORIGINAL = { -1, 7, 0, -2, 1, 3, 4, 5, 10, 9, 8, -3, 11, 14, 17, 15, 18, 19, 20,
			-6 };
	private static final Integer[] SOLUTION = { -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19,
			20 };

	@Test
	public void bubbleTest() {

		final Integer[] input = ORIGINAL.clone();

		Sort.algorithm().bubble().sort(input, (x, y) -> Integer.compare(x, y));

		Assert.assertArrayEquals(SOLUTION, input);
	}

	@Test
	public void selectionTest() {

		final Integer[] input = ORIGINAL.clone();

		Sort.algorithm().selection().sort(input, (x, y) -> Integer.compare(x, y));

		Assert.assertArrayEquals(SOLUTION, input);
	}

	@Test
	public void insertionTest() {

		final Integer[] input = ORIGINAL.clone();

		Sort.algorithm().insertion().sort(input, (x, y) -> Integer.compare(x, y));

		Assert.assertArrayEquals(SOLUTION, input);
	}

}
