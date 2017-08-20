package com.brazilianbytes.ctci.algorithm.sort;

import com.brazilianbytes.ctci.algorithm.sort.bubble.Bubble;

public class Sort {
	
	private Sort() {
	}

	private static Algorithm algorithm;

	public static Algorithm algorithm() {

		if (Sort.algorithm == null) {
			Sort.algorithm = new Algorithm();
		}

		return algorithm;
	}

	public static class Algorithm {

		private ISort bubble;

		public ISort bubble() {

			if (this.bubble == null) {
				this.bubble = new Bubble();
			}

			return bubble;
		}
	}
}
