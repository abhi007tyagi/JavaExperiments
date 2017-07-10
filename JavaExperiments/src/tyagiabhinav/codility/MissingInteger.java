/**
 * 
 */
package tyagiabhinav.codility;

import java.util.HashSet;

/**
 * @author abhinavtyagi
 *
 */
public class MissingInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}

class FindMissingInteger {
	
	public int getMissingInteger(int[] A){
		int size = A.length;
		int max=0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<size; i++){
			if(A[i]>0 && set.add(A[i])){
				max = Math.max(max, A[i]);
			}
		}
		for(int i=1; i<=max+2; i++){
			if(!set.contains(i)){
				return i;
			}
		}
		return 1;
	}
}
