/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author abhinavtyagi
 *
 */
public class ArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>(n);
        
        for(int i=0;i<n;i++){
            int d = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>(d);
            for(int j=0;j<d;j++){
                array.add(scanner.nextInt());
            }
            arrays.add(array);
        }
        
        int q = scanner.nextInt();
        //ArrayList<int[]> queries = new ArrayList<>(q);
        for(int i=0;i<q;i++){
            //int[] query = new int[2];
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            //queries.add(query);
            
            if(x<arrays.size()){
                ArrayList<Integer> array = arrays.get(x);
                if(y<array.size()){
                    System.out.println(array.get(y));
                }else{
                    System.out.println("Error!");
                }
            }else{
                System.out.println("Error!");
            }
        }
        scanner.close();

	}

}
