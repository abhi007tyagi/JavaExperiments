/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class OddOccurrencesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OddOccurrence odd = new OddOccurrence();
		odd.findOddOccurrence(new int[]{1,2,1,2,3,2,1,1,2,3,7,2,2});
	}
}

class OddOccurrence {
	
	public void findOddOccurrence(int[] A){
		int size = A.length;
		int val = A[0];
		for(int i=1; i<size; i++){
			val = val^A[i];
		}
		System.out.println(val);
	}
}
