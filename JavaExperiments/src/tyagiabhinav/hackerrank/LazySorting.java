/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class LazySorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = in.nextInt();
		}

		if (N >= 2 && N <= 18) {
			double num = 0, newNum = 0;
			int i=0;
			while(true) {
				newNum += (i*(Math.pow(N, -i)));
				i++;
				if(countPlaces((double) newNum)>=7){
					break;
				}else{
					num = newNum;
				}
			}
			System.out.println(newNum);
		}
	}
	
	public static int countPlaces(Double d){
		String[] splitter = d.toString().split("\\.");
		return splitter[1].length();
	}

}
