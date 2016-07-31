/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class WholeSquareCount {
	
	public static int wholesquareCount(int a, int b){
		int count = 0;
		int tempCount = 0;
		for(int i=a; i<=b; i++){
			for(int j=1; j<=i; j++){
				tempCount++;
				if(j*j == i){
					count++;
				}
			}
		}
		System.out.println("temp"+tempCount);
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wholesquareCount(4, 25));
	}

}
