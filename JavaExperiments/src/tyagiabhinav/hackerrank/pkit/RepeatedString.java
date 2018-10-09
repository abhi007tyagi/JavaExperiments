/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class RepeatedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println("Count: "+result);

		scanner.close();
	}

	private static long repeatedString(String s, long n) {
		long count = 0;
		long numOfAinS = countOfAinString(s);
		long numOfAinSrem = 0;
		int sizeOfS = s.length();
		if(n>sizeOfS) {
			long rem = n%sizeOfS;
			numOfAinSrem = countOfAinString(s.substring(0, (int) rem));
			count = (numOfAinS * (n/sizeOfS)) + numOfAinSrem;
		}else {
			count = countOfAinString(s.substring(0, (int) n));
		}
		return count;
	}
	
	private static long countOfAinString(String s) {
		int numOfAinS = 0;
		int sizeOfS = s.length();
		for(int i=0; i<sizeOfS; i++) {
			if(s.charAt(i) == 'a') {
				numOfAinS++;
			}
		}
		return numOfAinS;
	}

}
