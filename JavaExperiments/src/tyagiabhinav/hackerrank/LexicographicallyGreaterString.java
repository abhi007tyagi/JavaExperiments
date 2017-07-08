/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LexicographicallyGreaterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] strArr = new String[t];
		for(int i=0; i<t; i++){
			strArr[i] = in.next();
		}
		
		LexicographicallyStringFinder lex = new LexicographicallyStringFinder();
		for(int i=0; i<t; i++){
			String lexStr = lex.getLexString(strArr[i]);
			if(lexStr.equals(strArr[i])){
				System.out.println("no answer");
			}else{
				System.out.println(lexStr);
			}
		}
	}
}

class LexicographicallyStringFinder {
	
	public String getLexString(String str){
		
		char[] ch = str.toCharArray();
		int size = ch.length;
		boolean isSwap = false;
		char pointer;
		int pos = 0;
		
		for(int i=size-1; i>=0; i--){
			pointer = ch[i];
			for(int j=i; j>=0; j--){
				if(pointer>ch[j]){
					ch[i] = ch[j];
					ch[j] = pointer;
					pos = j;
					isSwap = true;
					break;
				}
			}
			if(isSwap){
				break;
			}
		}
		if(isSwap){
			Arrays.sort(ch, pos+1, size);
		}
		return new String(ch);
	}
}
