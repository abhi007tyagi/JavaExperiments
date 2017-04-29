/**
 * 
 */
package tyagiabhinav.random;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class SubstringCount {

	
//	static int gPtr, gStr;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gPtr = sc.nextInt();
		int gStr = sc.nextInt();
		String pattern = sc.next();
		String inputStr = sc.next();
		sc.close();
		
		System.out.println(appearanceCount(gPtr, gStr, pattern, inputStr));
		
	}

	public static int appearanceCount(int input1,int input2, String input3,String input4)
    {
		allPerm = new HashSet<String>();
		permutation(input3, input1);
		return findSubstringCount(input2, input1, input4, input3);
    }
	
	static HashSet<String> allPerm;
	
	public static int findSubstringCount(int input2, int input1, String inStr, String inPtrn){
		int count = 0;
		int index = 0;
		while(index < (input2-input1)){
			String sub = inStr.substring(index, index++ +input1);
			if(allPerm.contains(sub)){
				count++;
			}
		}
		return count;
	}

	public static void permutation(String str, int g) {
		int n = str.length();
		permutation("", str, n, g);
	}

	private static void permutation(String prefix, String str, int n, int g) {
		if (g == 0) {
//            System.out.println(prefix);
            allPerm.add(prefix);
            return;
        }
		for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + str.charAt(i); 
            permutation( newPrefix, str, n, g - 1); 
        }
	}

}
