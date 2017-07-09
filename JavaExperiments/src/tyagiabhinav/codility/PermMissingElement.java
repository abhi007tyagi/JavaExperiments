/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class PermMissingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMissingElement findMissingElement = new FindMissingElement();
		System.out.println(findMissingElement.getMissingElement(new int[]{1,2,7,5,6,4}, 6));
	}
}

class FindMissingElement {
	
	public int getMissingElement(int A[], int N){
		int result = -1;
		int actualSum = 0;
		int currentSum = 0;
		for(int i=1; i<=N+1; i++){
			actualSum+=i;
		}
		
		for(int i=0; i<N; i++){
			currentSum+=A[i];
		}
		result = actualSum-currentSum;
		return result;
	}
}
