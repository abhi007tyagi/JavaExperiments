/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author abhinavtyagi
 *
 */
public class MakingAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		System.out.println(res);
		scanner.close();

	}

	private static int makeAnagram(String a, String b) {
		
		int [] letters =  new int[26];
		a.chars().forEach( c ->  letters[c-'a']++ );
		b.chars().forEach( c ->  letters[c-'a']-- );
		return IntStream.of(letters).map( i -> Math.abs(i)).sum();
	}

}
