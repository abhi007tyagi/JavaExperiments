/**
 * 
 */
package tyagiabhinav.random;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LastNDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int n = in.nextInt();
		
//		int s=0;
		for(int i=0; i<n; i++){
			System.out.print(d%10);
//			System.out.println(s=d%10);
			d/=10;
		}
//		System.out.println("avg of "+s+" = "+s/n);
		
	}

}
