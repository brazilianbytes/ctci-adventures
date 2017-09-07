
public class Merge {

	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 17, 55, 4, 2, -1, 90, 67, 876, -86 };
		int[] result = mergesort(a, 0, a.length - 1);
	}

	public static int[] mergesort(int a[], int lo, int hi) {
		if (lo == hi) {
			int b[] = new int[1];
			b[0] = a[lo];
			return b;
		}

		int mid = (lo + hi) / 2;
		return mergeit(mergesort(a, lo, mid), mergesort(a, mid + 1, hi));
	}

	public static int[] mergeit(int a[], int b[]) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				result[k] = a[i];
				i++;
			} else {
				result[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			result[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			result[k] = b[j];
			k++;
			j++;
		}

		return result;
	}
