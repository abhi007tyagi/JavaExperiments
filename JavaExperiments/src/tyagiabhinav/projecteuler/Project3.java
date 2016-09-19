/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project3 {

	/**
	 * Largest prime factor
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143 ?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int j = 0; j < T; j++) {
			int largestPrime = 0;
			int num = sc.nextInt();
			if (num % 2 == 0) {
				num /= 2;
				largestPrime = 2;
			}
			for (int i = 3; i <= num; i += 2) {
				if (num % i == 0) {
					// System.out.println(i + ", ");
					num /= i;
					largestPrime = i;
				}
			}
//			if (num > 2) {
//				System.out.println(num);
//			}else 
			if(largestPrime > 2){
				System.out.println(largestPrime);
			}
		}
	}

}
