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
		int arr[] = { 5, 1, 8, 3, 2, 9, 0, 6, 7, 4 };
		pairFinder.findPair(arr, 17);
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
				break;
			} else if (arr[leftIndex] + arr[rightIndex] > sum) {
				rightIndex++;
			} else if (arr[leftIndex] + arr[rightIndex] < sum) {
				leftIndex++;
			}
		}
	}
}
