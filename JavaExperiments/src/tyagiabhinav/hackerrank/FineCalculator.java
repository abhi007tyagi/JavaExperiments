/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author abhinavtyagi
 *
 */
public class FineCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int da = in.nextInt();
		int ma = in.nextInt();
		int ya = in.nextInt();
		int de = in.nextInt();
		int me = in.nextInt();
		int ye = in.nextInt();
		
		CalculateFine fine = new CalculateFine();
		System.out.println(fine.getFine(da, ma, ya, de, me, ye));
	}
}

class CalculateFine{
	
	public int getFine(int da, int ma, int ya, int de, int me, int ye){
		int fine = 0;
		if(ya>ye){
			fine = 10000;
		}else if(da<=de && ma>me && ya<=ye){
			fine = 500*(ma-me);
		}else if(da>de && ma<=me && ya<=ye){
			fine = 15*(da-de);
		}else if(da>de && ma>me && ya>=ye){
			fine = 500*(ma-me);
		}else if(da<=de && ma<=me && ya<ye){
			fine = 0;
		} 
		return fine;
	}
}
