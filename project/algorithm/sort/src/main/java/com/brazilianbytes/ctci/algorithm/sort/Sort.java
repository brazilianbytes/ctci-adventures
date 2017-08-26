package com.brazilianbytes.ctci.algorithm.sort;

import com.brazilianbytes.ctci.algorithm.sort.bubble.Bubble;
import com.brazilianbytes.ctci.algorithm.sort.insertion.Insertion;
import com.brazilianbytes.ctci.algorithm.sort.selection.Selection;

/**
 * Utility class to reunite all tpes of Sort
 * 
 * @author luciano
 *
 */
public final class Sort {
	
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

		private SortInterface bubble;
		private SortInterface selection;
		private SortInterface insertion;

		public SortInterface bubble() {

			if (this.bubble == null) {
				this.bubble = new Bubble();
			}

			return this.bubble;
		}


		public SortInterface selection() {

			if (this.selection == null) {
				this.selection = new Selection();
			}

			return this.selection;
		}
		
		public SortInterface insertion() {

			if (this.insertion == null) {
				this.insertion = new Insertion();
			}

			return insertion;
		}

	}
}
