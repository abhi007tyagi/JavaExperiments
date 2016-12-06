/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int d = in.nextInt();

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		int[] arr2 = new int[N];
		
		for (int i = 0; i < N; i++) {
	        arr2[(i + N - d) % N] = arr [i];
	    }

		print(arr2, N);
	}

	private static void print(int[] arr, int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
