/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class PermCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PermutationCheck check = new PermutationCheck();
		System.out.println(check.isPermutation(new int[] {4,1,3,2}));
	}
}

class PermutationCheck {
	
	public int isPermutation(int[] A){
		int size = A.length;
		int[] temp = new int[size];
		int count = 0;
		int sum = 0;
		
		for(int i=1; i<=size; i++){
			sum+=i;
		}
		
		for(int i=0;i<size;i++){
			sum-=A[i];
			if(A[i]<size){
				if(temp[A[i]] == 0){
					temp[A[i]] = A[i];
					count++;
				}
			}
		}
		return (count==(size-1) && sum==0)?1:0;
	}
}
