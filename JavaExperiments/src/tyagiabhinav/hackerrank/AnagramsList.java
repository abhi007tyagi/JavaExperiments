package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramsList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		String row = null;
		while (!(row = in.nextLine()).isEmpty()) {
			list.add(row);
		}

		for (int i = 0; i < list.size(); i++) {
			String word1 = list.get(i);
			Set<String> anagramSet = new HashSet<String>();
			anagramSet.add(word1);
			for (int j = i + 1; j < list.size(); j++) {
				String word2 = list.get(j);
				if (isAnagram(word1, word2)) {
					anagramSet.add(word2);
				}
			}
			for (String words : anagramSet) {
				System.out.print(words);
			}
			System.out.println();
		}
	}

	private static boolean isAnagram(String s1, String s2) {
//		System.out.println("S1->" + s1);
//		System.out.println("S2->" + s2);

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

}
