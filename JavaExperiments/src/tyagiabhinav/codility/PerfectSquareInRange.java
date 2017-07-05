/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class PerfectSquareInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PerfectSquare perfectSquare = new PerfectSquare();
		System.out.println(perfectSquare.getPerfectSquareCount(2, 20));
	}
}

class PerfectSquare {
	
	public int getPerfectSquareCount(int a, int b){
		int count = 0;
		count = tricWay(a, b);//bruteForceWay(a, b);
		return count;
	}
	
	private int bruteForceWay(int a, int b){
		int count = 0;
		for(int i=a; i<=b; i++){
			
			for(int j=1; j*j<=i; j++){
				if(j*j==i){
					count++;
				}
			}
		}
		return count;
	}
	
	private int tricWay(int a, int b){
		int count = 0;
		count = (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
		System.out.println("Floor = " +Math.floor(Math.sqrt(b)));
		System.out.println("Ceil = " +Math.ceil(Math.sqrt(a)));
		return count;
	}
}
