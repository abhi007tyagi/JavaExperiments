/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Hiking_CountValleyMountains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		System.out.println("Result: " + result);
		scanner.close();
	}

	private static int countingValleys(int n, String s) {
		int numValleys = 0;
		int counter = 0;
		boolean valleyStart = false;
		for (int i = 0; i < n; i++) {
			switch (s.charAt(i)) {
			case 'U':
			case 'u':
				++counter;
				break;
			case 'D':
			case 'd':
				--counter;
				break;
			}
			if(counter == -1) {
				valleyStart = true;
			}
			if(counter == 0 && valleyStart) {
				++numValleys;
				valleyStart = false;
			}
		}
		return numValleys;
	}

}
