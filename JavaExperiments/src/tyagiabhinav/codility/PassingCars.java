/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class PassingCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountPassingCars car = new CountPassingCars();
		System.out.println(car.countCars(new int[] {0,1,0,1,1,1,0,1,1,1}));
	}
}

class CountPassingCars{
	
	public int countCars(int[] A){
		int count = 0;
		int size = A.length;
		int multiplier = 0;
		
		for(int i=0; i<size; i++){
			if(A[i]==0){
				multiplier++;
			}else if(A[i] == 1){
				count += multiplier; 
			}
		}
		return (Math.abs(count)>1000000000)?-1:count;
	}
}
