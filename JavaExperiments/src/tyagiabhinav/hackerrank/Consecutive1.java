/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Consecutive1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n;
        int count = 0;
        int maxCount = 0;
        boolean lastOne = false;
        while(num>=1){
            if(num%2 == 1){
                count++;
                lastOne = true;
            }else{
                if(lastOne){
                    maxCount = Math.max(maxCount, count);
                }
                count = 0;
            }
            num = num/2;
        }
        System.out.println(Math.max(maxCount, count));
    }

}
