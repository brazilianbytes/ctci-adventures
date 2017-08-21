package com.brazilianbytes.ctci.algorithm.sort;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class TestUtil {

	public static Case<Integer[]> generateIntegerArray(final int size) {
		
		final Integer[] input = new Integer[size];
		
		Arrays.setAll(input, (index) -> ThreadLocalRandom.current().nextInt(-999, 999));

		Integer[] solution = input.clone();

		Arrays.sort(solution);
		
		return new Case<Integer[]>(input, solution);
	}
	
	public static class Case<T> {
		
		private T input;
		private T solution;

		public Case() {
		}
		
		public Case(T input, T solution) {
			this.input = input;
			this.solution = solution;
		}
		
		public T getInput() {
			return input;
		}
		
		public void setInput(T input) {
			this.input = input;
		}
		
		public T getSolution() {
			return solution;
		}
		
		public void setSolution(T solution) {
			this.solution = solution;
		}
	}
}
