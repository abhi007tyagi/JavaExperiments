/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LeftRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[] ar = new int[n];
		for(int j=0; j<n; j++){
			ar[j] = sc.nextInt();
		}
		
		int pointer = d;
		int i = 0;
		int[] temp = new int [n];
		while(i<n){
			if(pointer >= n){
				pointer = 0;
			}
			temp[i++] = ar[pointer++];
		}
		for(int j=0; j<n; j++){
			System.out.print(temp[j]+" ");
		}
	}

}
