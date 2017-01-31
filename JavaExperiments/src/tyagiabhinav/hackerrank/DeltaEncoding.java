/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class DeltaEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<8; i++){
			list.add(in.nextInt());
		}
		System.out.print(list.get(0));
		for(int i=1; i<list.size(); i++){
			
			int num = list.get(i);
			int out = num - list.get(i-1);
			if(-127 <= out && out <= 127 ){
				System.out.print(" "+ out);
			}else{
				System.out.print(" -128 "+ out);
			}
		}

	}

}
