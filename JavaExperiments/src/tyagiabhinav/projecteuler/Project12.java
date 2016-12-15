/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project12 {

	/**
	 * The sequence of triangle numbers is generated by adding the natural
	 * numbers. So the 7'th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 =
	 * 28. The first ten terms would be: 1, 3, 6, 10, 15, 21, 28, 36, 45, 55,
	 * ... Let us list the factors of the first seven triangle numbers:
	 * 
	 * 1: 1 3: 1,3 6: 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28:
	 * 1,2,4,7,14,28
	 * 
	 * We can see that 28 is the first triangle number to have over five
	 * divisors. What is the value of the first triangle number to have over
	 * divisors?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter T");
		int[] primeNumbers = sieveOfEratosthenes(10000000); // Sieve of Eratosthenes 664579 prime numbers in total... N should be <= 664579

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
//			long start = System.currentTimeMillis();
			int num = in.nextInt();
			long triangleNum = 0;
			int divisorCount = 0;
			int j = 1;
			while (divisorCount <= num) {
				triangleNum += j++;
//				System.out.print(triangleNum);
				divisorCount = getDivisorCount(triangleNum, primeNumbers);
//				System.out.println("->" + divisorCount);
			}
//			System.out.println("Final count-> " + divisorCount + " Triangle num-> " + triangleNum);
//			long end = System.currentTimeMillis();
//			System.out.println((float) (end - start) / 1000);
			System.out.println(triangleNum);
		}
	}

	private static int getCountOfDivisors(long number) {
		int nod = 0;
		int sqrt = (int) Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				nod += 2;
			}
		}
		// Correction if the number is a perfect square
		if (sqrt * sqrt == number) {
			nod--;
		}

		return nod;
	}
	
	private static int getDivisorCount(long number, int[] primelist) {
	    int nod = 1;
	    int exponent;
	    long remain = number;
	 
	    for (int i = 0; i < primelist.length; i++) {
	        // In case there is a remainder this is a prime factor as well
	        // The exponent of that factor is 1
	        if (primelist[i] * primelist[i] > number) {
	            return nod * 2;
	        }
	 
	        exponent = 1;
	        if(primelist[i] !=0)
	        while (remain % primelist[i] == 0) {
	            exponent++;
	            remain /= primelist[i];
	        }
	        nod *= exponent;
	 
	        //If there is no remainder, return the count
	        if (remain == 1) {
	            return nod;
	        }
	    }
	    return nod;
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