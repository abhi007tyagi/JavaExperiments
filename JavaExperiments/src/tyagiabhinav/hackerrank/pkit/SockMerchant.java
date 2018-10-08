/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class SockMerchant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
//            int arItem = scanner.nextInt();
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		int result = sockMerchant(n, ar);
		System.out.println("Pairs: " + result);
		scanner.close();
	}

	private static int sockMerchant(int n, int[] ar) {

		int numPairs = 0;
		HashMap<Integer, Integer> numCountMap = new HashMap<>();
		for (int num : ar) {
			int val = 0;
			if (numCountMap.get(num) != null) {
				val = numCountMap.get(num);
				numCountMap.put(Integer.valueOf(num), ++val);
				if (val % 2 == 0) {
					numPairs++;
				}
			} else {
				numCountMap.put(Integer.valueOf(num), ++val);
			}
		}

		return numPairs;
	}

}
