/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class CountDivisibleNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int A=2;
		int B=576949;
		int K=19;
		
		// O(1)
		int b = B/K;
	    int a = (A > 0 ? (A - 1)/K: 0);
	    if(A == 0){
	        b++;
	    }
	    System.out.println(b - a);
	    
	    //O(n)
	    int count = 0;
	    for(int i=A; i<=B; i++){
	    	if(i%K == 0){
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}

}
