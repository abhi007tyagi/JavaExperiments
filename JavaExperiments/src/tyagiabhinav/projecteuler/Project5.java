/**
 * 
 */
package tyagiabhinav.projecteuler;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Project5 {

	/**
	 * Smallest multiple
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++){
				arr[i] = i+1;
			}
			long prod = 1;
			for(int i=1; i<N; i++){
				prod = prod*arr[i];
				int temp = arr[i];
				for(int j=i; j<N; j++){
					if(arr[j] == 1){
						continue;
					}else{
						if(arr[j]%temp == 0){
							arr[j] /= temp;
						}
					}
				}
				
			}
			System.out.println(prod);
		}
	}

}
