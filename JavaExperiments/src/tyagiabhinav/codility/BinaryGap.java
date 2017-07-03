/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.lognSolution(9));
		System.out.println(sol.lognSolution(529));
		System.out.println(sol.lognSolution(20));
		System.out.println(sol.lognSolution(15));
		System.out.println(sol.lognSolution(1041));
		System.out.println(sol.lognSolution(2147483637));
		
		for(int i=4; i>0; i--){
			for(int j=0; j<4-i; j++){
				System.out.print(" ");
			}
			for(int j=2*i-1; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}
	
	class Solution { 
		
		public int solution(int N){
			int length = 0;
			int maxLength = 0;
			
			String binary = Integer.toBinaryString(N);
			System.out.println(binary);
			int size = binary.length();
			char prev;
			for (int i=1; i<size; i++) {
				prev = binary.charAt(i-1);
				if(prev == '1' && binary.charAt(i) == '0'){
					length = 1;
				}else if(length > 0 && binary.charAt(i) == '0'){
					length++;
				}else if(length > 0 && binary.charAt(i) == '1'){
					if(maxLength <= length){
						maxLength = length;
					}
				}
			}
			
			return maxLength;
		} 
		
		public int lognSolution(int n){
			return solution(n,0,0);
		}
		
		static int solution(int n, int max, int current) {
		    if (n == 0)
		        return max;
		    else if (n % 2 == 0)
		        return solution(n / 2, max, current + 1);
		    else
		        return solution(n / 2, Math.max(max, current), 0);
		}
	}


