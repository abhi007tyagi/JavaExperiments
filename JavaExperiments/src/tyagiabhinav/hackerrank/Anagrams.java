/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author abhinavtyagi
 *
 */
public class Anagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			String s = in.next();
			int mid = s.length() / 2;
			System.out.println("Anagram : " + getDiff(s.substring(0, mid), s.substring(mid)));
		}
		in.close();
	}

	private static boolean isAnagram(String s1, String s2) {
		System.out.println("S1->" + s1);
		System.out.println("S2->" + s2);

		if (s1.length() == s2.length()) {
			char[] ss1 = s1.toCharArray();
			char[] ss2 = s2.toCharArray();

			Arrays.sort(ss1);
			Arrays.sort(ss2);

			for (int i = 0; i < ss1.length; i++) {
				if (ss1[i] != ss2[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private static int getDiff(String s1, String s2) {
		if (s1.length() == s2.length()) {
			int diff = 0;
			for (int i = 0; i < s1.length(); i++) {
				boolean isFound = false;
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						StringBuilder sb = new StringBuilder(s2);
						sb.deleteCharAt(j);
						s2 = sb.toString();
						isFound = true;
						break;
					}
				}
				if(!isFound){
					diff++;
				}
			}
			return diff;
		} else {
			return -1;
		}
	}
}
