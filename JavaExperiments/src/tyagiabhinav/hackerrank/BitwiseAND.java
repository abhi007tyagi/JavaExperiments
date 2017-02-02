/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class BitwiseAND {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
//		for (int a0 = 0; a0 < t; a0++) {
//			int n = in.nextInt();
//			int k = in.nextInt();
//			maxAnd(n, k);
//		}
		int A[] = new int[]{-1,3,-4,5,1,-6,2,1};
		solution(A);
	}

	private static void maxAnd(int n, int k) {
		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int and = i & j;
				if (and < k) {
					max = Math.max(max, and);
				}
			}
		}
		System.out.println(max);
	}

	//{-1,3,-4,5,1,-6,2,1}
	public static void solution(int[] A) {
		// write your code in Java SE 8
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
//		System.out.println(sum);
		int newSum = 0;
		for (int i = 1; i < A.length; i++) {
			newSum += A[i-1];
			sum -= (A[i-1]);
//			System.out.println(i+"-n-"+newSum);
//			System.out.println(i+"-s-"+(sum-A[i]));
			if(newSum == (sum-A[i])){
				System.out.println(i);
			}
		}
	}
}
