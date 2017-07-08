/**
 * 
 */
package tyagiabhinav.random;

import java.util.Arrays;

/**
 * @author abhinavtyagi
 *
 */
public class FindPairToSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PairFinder pairFinder = new PairFinder();
		int arr[] = { 5, 1, 8, 3, 2, 9, 10, 6, 7, 4 };
		pairFinder.findPair(arr, 7);
	}
}

class PairFinder {

	// O(n) time complexity
	public void findPair(int[] arr, int sum) {
		Arrays.sort(arr);
		int arrSize = arr.length;
		int leftIndex = 0;
		int rightIndex = arrSize - 1;

		while (leftIndex < rightIndex) {
			if (arr[leftIndex] + arr[rightIndex] == sum) {
				System.out.println(arr[leftIndex] + " - " + arr[rightIndex]);
				leftIndex++; // for printing all pairs
				rightIndex--; // for printing all pairs
//				break; //to print one uncomment break and comment above 2 lines
			} else if (arr[leftIndex] + arr[rightIndex] > sum) {
				rightIndex--;
			} else if (arr[leftIndex] + arr[rightIndex] < sum) {
				leftIndex++;
			}
		}
	}
}
