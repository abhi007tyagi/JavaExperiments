/**
 * 
 */
package tyagiabhinav.projecteuler;

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
		long num = 600851475143L;
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
//				System.out.print(i + ", ");
				num /= i;
			}
		}
		if (num > 2) {
			System.out.print(num);
		}
	}

}
