/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class AlternatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = alternatingCharacters(s);
			System.out.println(result);
		}
		scanner.close();
	}

	private static int alternatingCharacters(String s) {
		int count = 0;
		char prev = '`';
		char[] chArr = s.toCharArray(); 
		for(char ch: chArr){ 
			if(ch == prev) 
				count++;
			else
				prev = ch;
		};
		return count;
	}

}
