/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(binomialCoeff(i, j));
			}
			System.out.println();
		}
	}

	private static int binomialCoeff(int n, int k) {
		/*
		 
		   (n)         n!           
		  (---) =  ----------               
		   (k)      k!(n-k)!
		  
		  
		 */
		int neu = factorial(n);
		int deno = factorial(k);
		deno = deno*(factorial(n-k));
		

		return neu/deno;
	}

	private static int factorial(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		return fact;
	}

}
