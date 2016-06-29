/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		String[] input = new String[arrSize];
		for (int i = 0; i < arrSize; i++) {
			String data = in.next();
			if (data.length() <= 20) {
				input[i] = data;
			}
		}
		int arr2Size = in.nextInt();
		for (int i = 0; i < arr2Size; i++) {
			String data = in.next();
			System.out.println(getPresenceCount(input, input.length, data));
		}

	}

	private static int getPresenceCount(String[] arr, int len, String dat) {
		int r = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i].equals(dat)) {
				r++;
			}
		}
		return r;
	}

}
