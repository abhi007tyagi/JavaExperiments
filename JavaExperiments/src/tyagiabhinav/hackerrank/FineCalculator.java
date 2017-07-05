/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

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
		
//		Calendar calA = Calendar.getInstance();
//		calA.set(ya, ma, da);
//		
//		Calendar calE = Calendar.getInstance();
//		calE.set(ye, me, de);
		
		CalculateFine fine = new CalculateFine();
//		System.out.println(fine.getFine(calA, calE));
		System.out.println(fine.getFine(da, ma, ya, de, me, ye));
	}
}

class CalculateFine{
	
	public int getFine(Calendar calA, Calendar calE){
		int fine = 0;
		
		if(!calA.after(calE)){
			fine = 0;
		}else{
			int dayDiff = daysBetween(calA.getTimeInMillis(), calE.getTimeInMillis());
//			System.out.println(dayDiff);
			if(dayDiff > 28){
				if(calA.get(Calendar.DAY_OF_MONTH) < calE.get(Calendar.DAY_OF_MONTH)){
					fine = 15*(dayDiff);
				}else if(calA.get(Calendar.MONTH) > calE.get(Calendar.MONTH) && calA.get(Calendar.YEAR) < calE.get(Calendar.YEAR)){
					fine = 500*(calA.get(Calendar.MONTH) - calE.get(Calendar.MONTH));
				}else if(calA.get(Calendar.YEAR) > calE.get(Calendar.YEAR)){
					fine = 10000;
				}
			}else{
				fine = 15*(dayDiff);
			}
		}
		return fine;
	}
	
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
	
	private int daysBetween(long t2, long t1) {
	    return 1 + (int) ((t2 - t1) / (1000 * 60 * 60 * 24));
	}
	
	
}
