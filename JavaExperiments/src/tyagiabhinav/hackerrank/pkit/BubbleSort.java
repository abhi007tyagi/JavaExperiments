/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		countSwaps(a);

		scanner.close();
	}

	private static void countSwaps(int[] a) {
		int count = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		        	// swap(a[j], a[j + 1]);
		        	int temp = a[j];
		        	a[j] = a[j+1];
		        	a[j+1] = temp;
		        	++count;
		        }
		    }
		}
		System.out.println(String.format("Array is sorted in %s swaps.  \n" + 
				"First Element: %s  \n" + 
				"Last Element: %s ", count, a[0], a[n-1]));
	}


}
