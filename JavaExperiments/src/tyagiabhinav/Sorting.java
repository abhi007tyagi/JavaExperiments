/**
 * 
 */
package tyagiabhinav;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Input Array");
		printArray(arr);
		System.out.println("\nSorted Array");
		printArray(threeWayQuickSort(arr, 0, arr.length - 1));
	}

	public static int[] insertionSort(int[] arr) {
		// Do insertion sort
		int arrayLength = arr.length;
		for (int j = 1; j < arrayLength; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		return arr;
	}

	public static int[] reverseInsertionSort(int[] arr) {
		// Do reverse insertion sort
		int arrayLength = arr.length;
		for (int j = arrayLength - 2; j >= 0; j--) {
			int key = arr[j];
			int i = j + 1;
			while (i <= (arrayLength - 1) && arr[i] > key) {
				arr[i - 1] = arr[i];
				i++;
			}
			arr[i - 1] = key;
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		// Do selection sort
		int arraySize = arr.length;
		for (int j = 0; j < arraySize; j++) {
			int small = arr[j];
			for (int i = j + 1; i < arraySize; i++) {
				if (arr[i] < small) {
					int temp = small;
					small = arr[i];
					arr[i] = temp;
				}
			}
			arr[j] = small;
		}
		return arr;
	}

	public static int[] mergeSort(int[] arr) {
		int arrSize = arr.length;
		if (arrSize == 1) {
			return arr;
		}

		int mid = arrSize / 2;
		int[] left = new int[mid];
		int[] right = new int[arrSize - mid];
		// System.out.println("Left Size->"+left.length);
		// System.out.println("Right Size->"+right.length);

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		// System.out.print("Left Array: ");printArray(left);

		for (int i = 0; i < (arrSize - mid); i++) {
			right[i] = arr[i + mid];
		}
		// System.out.print("Right Array: ");printArray(right);

		left = mergeSort(left);
		right = mergeSort(right);

		return mergeArrays(left, right);

	}

	public static int[] mergeArrays(int[] left, int[] right) {
		int lSize = left.length;
		int rSize = right.length;
		int[] merged = new int[lSize + rSize];
		int l = 0, r = 0, m = 0;

		// while both arrays have elements
		while (l < lSize && r < rSize) {
			if (left[l] <= right[r]) {
				// add left to merged array and increment m and l pointer
				merged[m++] = left[l++];
			} else {
				// add right to merged array and increment m and r pointer
				merged[m++] = right[r++];
			}
		}

		// while any remaining elements in left array, add to merged array
		while (l < lSize) {
			merged[m++] = left[l++];
		}

		// while any remaining elements in right array, add to merged array
		while (r < rSize) {
			merged[m++] = right[r++];
		}

		// printArray(merged);
		return merged;
	}

	/**
	 * 
	 * @param arr
	 *            with distinct values only
	 * @param l
	 * @param r
	 * @return
	 */
	public static int quickPartition(int[] arr, int l, int r) {
		// extract pivot
		int pivot = arr[r];
		// save last index of array
		int p = r;
		// decrement last index for comparison
		r--;

		while (true) {
			System.out.println("running...");
			// increment first index while value of arr[l] < pivot
			while (arr[l] < pivot && l <= p) {
				l++;
			}
			// decrement last index while value of arr[l] > pivot
			while (arr[r] > pivot && r > 0) {
				r--;
			}
			// pivot point found
			if (l >= r) {
				break;
			} else {
				// swap values and continue
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				// printArray(arr);
			}
		}
		// swap pivot value with pivot point value
		int temp = arr[l];
		arr[l] = arr[p];
		arr[p] = temp;
		// System.out.print("ITT---> ");printArray(arr);

		// return pivot point value
		return l;
	}

	public static int[] quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = quickPartition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
		// printArray(arr);
		return arr;
	}

	public static int[] threeWayQuickSort(int[] arr, int lo, int hi) {
		if (hi <= lo) {
			return arr;
		}
		int l = lo, r = hi, i = lo;
		int pivot = arr[lo];
		while (i <= r) {
//			System.out.println("lo=" + lo + " hi=" + hi + " piv=" + pivot + " i=" + i + " l=" + l + " r=" + r);
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i++] = arr[l];
				arr[l++] = temp;
			} else if (arr[i] > pivot) {
				int temp = arr[i];
				arr[i] = arr[r];
				arr[r--] = temp;
			} else {
				i++;
			}
//			System.out.print("-->");
//			printArray(arr);
		}
		threeWayQuickSort(arr, lo, l - 1);
		threeWayQuickSort(arr, r + 1, hi);

		return arr;
	}

	public static void printArray(int[] arr) {
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------");
	}

}
