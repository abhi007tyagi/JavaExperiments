/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Mark_Toys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] prices = new int[n];

		String[] pricesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pricesItem = Integer.parseInt(pricesItems[i]);
			prices[i] = pricesItem;
		}

		int result = maximumToys(prices, k);
		System.out.println(result);

		scanner.close();

	}

	private static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int sum = 0;
		int count = 0;
		for(int price : prices) {
			sum += price;
			if(sum > k) {
				break;
			}else {
				++count;
			}
		}
		return count;
	}

}
