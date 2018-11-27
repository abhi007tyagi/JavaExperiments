/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		scanner.close();
	}

	static int[] rotLeft(int[] a, int d) {
		int size = a.length;
		int[] temp = new int[size];
		for (int i = 0; i < size; i++) {
			if(d >= size){
				d = 0;
			}
			temp[i] = a[d++];
		}
		return temp;
	}

}
