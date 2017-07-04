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
		k = k % 26; // to remove multiples of 26 and get the exact value we need
					// to shift

		StringBuilder strBuilder = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			int chInt = (int) ch;

			if (Character.isLetter(ch)) {
				if (chInt >= 65 && chInt <= 90 && (chInt + k) >= 97) {
					strBuilder.append((char) (ch + k - 26));
				} else {
					chInt += k;

					if (chInt >= 65 && chInt <= 90 || chInt >= 97 && chInt <= 122) {
						strBuilder.append((char) (ch + k));
					} else if ((chInt > 90 && chInt < 97) || chInt > 122) {
						strBuilder.append((char) (ch + k - 26));
					}
				}
			} else {
				strBuilder.append(ch);
			}
		}
		System.out.println(strBuilder.toString());
	}

}
