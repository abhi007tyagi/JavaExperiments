/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project8 {

	/**
	 * Largest product in a series
	 * 
	 * Find the greatest product of K consecutive digits in the N digit number.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int r = 0; r < T; r++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String input = sc.next();
			long maxProd = 0;
			long prevProd = 0;
			long currProd = 0;

			for (int i = 1; i <= (N - K); i++) {
				prevProd = getArrayProd(input, i - 1, K);
				currProd = getArrayProd(input, i, K);
				if (currProd >= prevProd) {
					if (currProd > maxProd) {
						maxProd = currProd;
					}
				}else{
					if (prevProd > maxProd) {
						maxProd = prevProd;
					}
				}
			}
			System.out.println(maxProd);
		}
	}

	private static long getArrayProd(String num, int start, int K) {
		int[] arr1 = new int[K];
		char[] cArr = num.substring(start, start + K).toCharArray();
		long prod = 0;
		for (int j = 0; j < K; j++) {
			arr1[j] = Character.getNumericValue(cArr[j]);
			if (j == 0) {
				prod = arr1[j];
			} else {
				prod *= arr1[j];
			}
		}
		return prod;
	}

}
