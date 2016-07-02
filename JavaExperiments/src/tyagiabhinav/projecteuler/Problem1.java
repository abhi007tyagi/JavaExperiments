/**
 * 
 */
package tyagiabhinav.projecteuler;

/**
 * @author abhinavtyagi
 *
 */
public class Problem1 {

	/**
	 * Multiple of 3 and 5
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//if(num%3==0) => number is divisible by 3
		//if(num%5==0) => number is divisible by 5
		//if(num%15==0) => number is divisible by 15 or by both 3 & 5 (to be used if we want sum for num divisible by 3 AND 5)
		int sum=0;
		for(int i=0;i<1000;i++){
			if(i%3==0){
				sum+=i;
			}else if(i%5==0){
				sum+=i;
			}
		}
		System.out.println("Sum="+sum);
	}

}
