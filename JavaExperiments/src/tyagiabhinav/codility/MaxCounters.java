/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class MaxCounters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculateMaxCounter calculateMaxCounter = new CalculateMaxCounter();
		int[] arr = calculateMaxCounter.getMaxCounters(5, new int[]{3,4,4,6,1,4,4});
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

class CalculateMaxCounter {
	
	public int[] getMaxCounters(int N, int[] A){
		int[] counters = new int[N];
		int max = 0;
		int aSize = A.length;
		
		for(int i=0;i<aSize;i++){
			if(A[i]<=N && A[i]>0){
				counters[A[i]-1]++;
				max = Math.max(max, counters[A[i]-1]);
			}else{
				for(int j=0; j<N; j++){
					counters[j]=max;
				}
			}
			for(int k=0; k<N; k++){
				System.out.print(counters[k]+" ");
			}
			System.out.println();
		}
		
		return counters;
	}
}
