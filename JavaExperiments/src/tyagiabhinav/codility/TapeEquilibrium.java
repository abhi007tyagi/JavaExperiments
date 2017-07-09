/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class TapeEquilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindEquilibrium findEquilibrium = new FindEquilibrium();
		System.out.println(findEquilibrium.getEquilibrium(new int[]{3,1,2,4,3,13}));
	}
}

class FindEquilibrium {
	
	public int getEquilibrium(int[] A){
		int size = A.length;
		int sum = 0;
		int smallest = 10000;
		int temp = 0;
		int rem = 0;
		
		for(int i=0; i<size; i++){
			sum += A[i];
		}
		
		rem=sum;
		for(int i=0; i<size-1; i++){
			temp+=A[i];
			rem-=A[i];
//			System.out.println(smallest+" -- "+Math.abs(temp-rem));
			smallest = Math.min(smallest, Math.abs(temp-rem));
		}
		
		return smallest;
	}
}
