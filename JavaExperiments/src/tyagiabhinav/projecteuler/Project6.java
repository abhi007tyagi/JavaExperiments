/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project6 {

	/**
	 * Sum square difference
	 * 
	 * The sum of the squares of the first ten natural numbers is,
	 * 12 + 22 + ... + 102 = 385
	 * The square of the sum of the first ten natural numbers is,
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	 * Find the difference between the sum of the squares of the first N natural numbers and the square of the sum.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			long sumOfSquare = 0;
			long squareOfSum = 0;
			for(int i=1; i<=N; i++){
				sumOfSquare += i*i;
			}
			for(int i=1; i<=N; i++){
				squareOfSum += i;
			}
			squareOfSum *= squareOfSum;
			
			System.out.println(Math.abs(squareOfSum-sumOfSquare));
		}
	}

}
