/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class MinAvgTwoSlice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMinAvg minAvg = new FindMinAvg();
		System.out.println(minAvg.getMinIndexOfAvgSlice(new int[]{}));
	}
}

class FindMinAvg {
	
	public int getMinIndexOfAvgSlice(int[] A){
		int index = 0;
		double minAvg = 10000;
		int size = A.length;
		
		for(int i=0; i<size-1; i++){
			double avg2;
			double avg3;
			// two slice avg
			if(i+1 < size){
				avg2 = (A[i]+A[i+1])/2.0;
				if(minAvg > avg2){
					minAvg = avg2;
					index = i;
				}
				System.out.println(A[i]+" - "+A[i+1]+ " = " + avg2);
				if(i+2 < size){
					avg3 = (A[i]+A[i+1]+A[i+2])/3.0;
					if(minAvg > avg3){
						minAvg = avg3;
						index = i;
					}
					System.out.println(A[i]+" - "+A[i+1]+ " - "+A[i+2]+" = " + avg3);
				}
			}
			System.out.println("min avg = "+ minAvg);
			System.out.println("index = "+ index);
		}
		return index;
	}
}