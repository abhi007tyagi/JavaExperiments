/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class ArrayGame {

	public static boolean canWin(int leap, int[] game) {
        int size = game.length;
        int i=0;
        boolean incremented = false;
        boolean decremented = false;
        while(i<size){
            if(i+1>=size || i+leap>=size){
                return true;
            }
            if(i+leap < size && game[i+leap] == 0){
                i+=leap;
            }else if(i+1 < size && game[i+1] == 0 && !decremented){
                i++;
                incremented = true;
                decremented = false;
            }else if(i-1 >=0 && game[i-1] == 0 && !incremented){
                i--;
                decremented = true;
                incremented = false;
            }else if((i>0 && game[i-1] == 1)||(i+1<size && game[i+1] == 1)||(i+leap<size && game[i+leap] == 1)){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            List list = new ArrayList(10);
//            list.re
            
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
