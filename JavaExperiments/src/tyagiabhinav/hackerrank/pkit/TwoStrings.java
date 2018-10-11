/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class TwoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);
			
			System.out.println(result);

		}
		scanner.close();
	}

	private static String twoStrings(String s1, String s2) {
		for(char ch : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
			if(s1.indexOf(ch) >= 0 && s2.indexOf(ch) >= 0) {
				return "YES";
			}
		}
		return "NO";
	}

//	// Function to print all substring
//	public static ArrayList<String> getSubStringMap(String str) {
//		int size = str.length();
//		ArrayList<String> subStrArr = new ArrayList();
//
//		for (int i = 0; i < size; i++) {
//			for (int j = i + 1; j <= size; j++) {
//				subStrArr.add(str.substring(i, j));
//			}
//		}
//		return subStrArr;
//	}
}
