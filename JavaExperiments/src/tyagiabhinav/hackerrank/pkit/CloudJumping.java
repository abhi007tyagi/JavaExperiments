/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class CloudJumping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);
		System.out.println("Min Steps: "+result);

		scanner.close();
	}

	private static int jumpingOnClouds(int[] c) {
		int minSteps = 0;
		int arrSize = c.length;
		int pointer = 0;
		while(pointer < arrSize-1) {
			if(pointer+2 < arrSize && c[pointer+2] == 0) {
				pointer+=2;
			}else {
				++pointer;
			}
			++minSteps;
		}
		return minSteps;
	}

}
