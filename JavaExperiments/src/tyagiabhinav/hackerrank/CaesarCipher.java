/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class CaesarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		StringBuilder strBuilder = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				if (!Character.isLetter((char) (ch + k))) {
					strBuilder.append((char) (ch + k - 26));
				} else {
					strBuilder.append((char) (ch + k));
				}
			} else {
				strBuilder.append(ch);
			}
		}
		System.out.println(strBuilder.toString());

	}

}
