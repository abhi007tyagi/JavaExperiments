/**
 * 
 */
package tyagiabhinav.projecteuler;

/**
 * @author abhinavtyagi
 *
 */
public class Problem2 {

	/**
	 * Even Fibonacci numbers
	 * 
	 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long sum = 0, num = 0;
		long numFirst = 1, numSecond = 1;
		
		while(num <= 4000000){
			num = numFirst+numSecond;
			if(num%2==0){
				sum+=num;
			}
			numFirst = numSecond;
			numSecond = num;
		}
		System.out.println("Sum="+sum);

	}

}
