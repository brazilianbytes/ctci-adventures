package com.brazilianbytes.ctci.algorithm.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.brazilianbytes.ctci.algorithm.sort.TestUtil.Case;

public class SortRandomTest {

	private Case<Integer[]> testCase;

	@Before
	public void setup() {
		testCase = TestUtil.generateIntegerArray(9999);
	}

	@Test
	public void insertionTest() {
		
		final Integer[] input = testCase.getInput().clone();
		
		Sort.algorithm().insertion().sort(input, (x, y) -> Integer.compare(x, y));
		
		Assert.assertArrayEquals(testCase.getSolution(), input);
	}
	
	@Test
	public void selectionTest() {

		final Integer[] input = testCase.getInput().clone();

		Sort.algorithm().selection().sort(input, (x, y) -> Integer.compare(x, y));

		Assert.assertArrayEquals(testCase.getSolution(), input);
	}

	@Test
	public void bubbleTest() {

		final Integer[] input = testCase.getInput().clone();

		Sort.algorithm().bubble().sort(input, (x, y) -> Integer.compare(x, y));

		Assert.assertArrayEquals(testCase.getSolution(), input);
	}

}
