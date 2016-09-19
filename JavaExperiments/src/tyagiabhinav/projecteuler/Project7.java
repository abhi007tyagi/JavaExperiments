/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project7 {

	/**
	 * 10001st prime
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13. What is the Nth prime number?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[] primeNumbers = sieveOfEratosthenes(10000000); // Sieve of Eratosthenes 664579 prime numbers in total... N should be <= 664579

		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			if(N <= 664579){
				System.out.println(primeNumbers[N]);
			}else{
				System.out.println("N should be <= 664579 !!");
			}
		}

	}

	private static int[] sieveOfEratosthenes(int n) {
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		int count = 0;
		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				++count;
//				System.out.println(++count+"-"+i+"-"+prime[i]);
			}
		}

		int[] primeNums = new int[count+1];
		// Add all prime numbers
		int j=1;
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				primeNums[j] = i;
//				System.out.println(j+"-"+primeNums[j]);
				j++;
			}
		}

		return primeNums;
	}
	// Scanner sc = new Scanner(System.in);
	// int T = sc.nextInt();
	// for (int k = 0; k < T; k++) {
	//// long start = System.currentTimeMillis();
	// int N = sc.nextInt();
	// int count = 1;
	// int prime = 2;
	//// if(N > 1){
	//// System.out.println(2);
	//// }
	// for(int i=3; count < N; i+=2) {
	// if (isPrime(i)) {
	//// System.out.println(i);
	// count++;
	// prime = i;
	// }
	// }
	// System.out.println(prime);
	//// long end = System.currentTimeMillis();
	//// System.out.println(end-start);
	// }
	// }
	//
	// private static boolean isPrime(int num) {
	//// if (num < 2)
	//// return false;
	//// if (num == 2)
	//// return true;
	//// if (num % 2 == 0)
	//// return false;
	// for (int i = 3; i * i <= num; i += 2)
	// if (((num+num/i)&i) == 0) //(x+x/7)&7 == ((num+num/i)&i)
	// return false;
	// return true;
	// }

}
