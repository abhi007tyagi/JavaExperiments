/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class RansomNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}

	private static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> magazineMap = getFrequencyMap(magazine);
		Map<String, Integer> noteMap = getFrequencyMap(note);
		boolean found = false;
		if (noteMap.size() <= magazineMap.size()) {
			found = noteMap.entrySet().stream()
					.allMatch(e -> magazineMap.containsKey(e.getKey()) && magazineMap.get(e.getKey()) >= e.getValue());
		} else {
			System.out.println("No");
		}
		System.out.println((found) ? "Yes" : "No");
	}

	private static HashMap<String, Integer> getFrequencyMap(String[] strArr) {
		HashMap<String, Integer> freqMap = new HashMap<>();
		for (String str : strArr) {
			int val = 0;
			if (freqMap.get(str) != null) {
				val = freqMap.get(str);
				freqMap.put(str, ++val);
			} else {
				freqMap.put(str, ++val);
			}
		}
		return freqMap;
	}

}
