/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Problem1 {
	
	static long s(long n) { return n * (n+1) / 2; }

	/**
	 * Multiple of 3 and 5
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
	 * all the multiples of 3 or 5 below 1000.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// if(num%3==0) => number is divisible by 3
		// if(num%5==0) => number is divisible by 5
		// if(num%15==0) => number is divisible by 15 or by both 3 & 5 (to be
		// used if we want sum for num divisible by 3 AND 5)
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long p;
		for (int j = 0; j < T; j++) {
			long N = sc.nextLong();
			long sum = 0;
			// for(int i=0;i<N;i++){
			// if(i%3==0||i%5==0){
			// sum+=i;
			// }
			// }
			N--;
			System.out.println(s(N/3)*3 + s(N/5)*5 - s(N/15)*15);
		}
		sc.close();
	}

}
