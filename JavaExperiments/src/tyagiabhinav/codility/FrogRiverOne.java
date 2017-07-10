/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class FrogRiverOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMinTime findMinTime = new FindMinTime();
		System.out.println(findMinTime.findMinTime(1, new int[]{1}));
	}
}

class FindMinTime {
	
	public int findMinTime(int X, int[] A){
		int count = 0;
		int size = A.length;
		if(X>size)
			return -1;
		
		int[] temp = new int[size];
		
		for(int i=0;i<size;i++){
		    if(A[i] < size){
    			if(temp[A[i]] == 0){
    				temp[A[i]] = A[i];
    				count++;
    			}
		    }
			if(count == X || A[i] == size)
				return i;
		}
		return -1;
	}
}
