/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project10 {

	/**
	 * 
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all
	 * the primes below two million = 142913828922
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] primeNumbers = sieveOfEratosthenes(10000000); // Sieve of Eratosthenes 664579 prime numbers in total... N should be <= 664579

		for (int a0 = 0; a0 < t; a0++) {
			int N = in.nextInt();
			long sum = 0;
			// using traditional approach
//			if (N == 2){
//				sum = 2;
//			} else if (N > 2) {
//				sum = 2;
//				for (int i = 3; i <= N; i+=2) {
//					if(isPrime(i)){
//						sum+=i;
//					}
//				}
//			}
			
			// using Sieve of Eratosthenes approach
			int i=0;
			while (primeNumbers[i] <= N) {
				sum += primeNumbers[i];
				i++;
			}
			System.out.println(sum);
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if ((num % i) == 0) 
				return false;
		return true;
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
	
}
