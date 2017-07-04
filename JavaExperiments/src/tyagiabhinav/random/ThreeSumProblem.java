/**
 * 
 */
package tyagiabhinav.random;

import java.util.Arrays;

/**
 * @author abhinavtyagi
 *
 */
public class ThreeSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindThreeSum findThreeSum = new FindThreeSum();
		int arr[] = { 5, 1, 8, 3, 2, 9, 10, 6, 7, 4 };
		findThreeSum.findThreeSum(arr, 6);
	}
}

class FindThreeSum {

	// takes O(n^2) time complexity
	public void findThreeSum(int[] arr, int sum) {
		Arrays.sort(arr);
		int arrSize = arr.length;
		for (int i = 0; i < arrSize - 2; i++) {
			int leftIndex = i;
			int rightIndex = arrSize - 1;

			while (leftIndex < rightIndex) {
				if (arr[i] + arr[leftIndex] + arr[rightIndex] == sum) {
					System.out.println(arr[i] + " - " + arr[leftIndex] + " - " + arr[rightIndex]);
					leftIndex++; // for printing all pairs
					rightIndex--; // for printing all pairs
					// break; //to print one uncomment break and comment above 2
					// lines
				} else if (arr[i] + arr[leftIndex] + arr[rightIndex] > sum) {
					rightIndex--;
				} else if (arr[i] + arr[leftIndex] + arr[rightIndex] < sum) {
					leftIndex++;
				}
			}
		}
	}
}
