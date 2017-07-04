package tyagiabhinav.random;

public class ArrayForLinkedList {

	public static void main(String[] args) {
		int[] A = { 1, 4, -1, 3, 2 };
		System.out.println(sol("asdefrgtyhgdwsdfrtyuiosdfs"));
	}

	public static int solution1(int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		int i = 0;
		int temp = 0;
		while (temp != -1 && i < size) {
			temp = A[temp];
			i++;
		}
		return i;
	}

	public static String sol(String S) {
		int[] occurrences = new int[26];
		for (char ch : S.trim().toCharArray()) {
			occurrences[ch - 'a']++;
		}
		char best_char = 'a';
		int best_res = 0;
		for (int i = 1; i < 26; i++) {
			if (occurrences[i] >= best_res) {
				best_char = (char) ((int) 'a' + i);
				best_res = occurrences[i];
			}
		}
		return Character.toString(best_char);
	}

}
