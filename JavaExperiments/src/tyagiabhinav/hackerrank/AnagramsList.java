package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramsList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		ArrayList<String> list = new ArrayList<>();
		while(!input.trim().isEmpty()){
			list.add(input);
			input = in.nextLine();
		}
		
		for(int i=0; i< list.size(); i++){
			String word1 = list.get(i);
			for(int j=i+1; j<list.size(); j++){
				String word2 = list.get(j);
				if(isAnagram(word1, word2)){
					if(word1.compareTo(word2)<0){
						System.out.println(word1+" "+word2);
					}else{
						System.out.println(word2+" "+word1);
					}
				}
			}
		}
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

}
