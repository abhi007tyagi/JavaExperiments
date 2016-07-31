/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class FindEquilibrium {

	public static void solution(int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		int totalSum = 0;
		int tempSum = 0;
		int equiIndex = -1;
		for (int i = 0; i < size; i++) {
			equiIndex++;
			if (equiIndex == size - 1 && totalSum == 0) {
				System.out.print(equiIndex + " ");
			}
			totalSum += A[i];
		}
		equiIndex = -1;
		for (int i = 0; i < size - 1; i++) {
			equiIndex++;
			totalSum -= A[equiIndex];
			if (i == 0 && totalSum == 0) {
				System.out.print(equiIndex + " ");
			} else if (i > 0) {
				tempSum += A[equiIndex-1];
				if (tempSum == totalSum) {
					System.out.print(equiIndex + " ");
				}
//				totalSum += A[equiIndex];
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { -1, 3, -4, 5, 1, -6, 2, 1 };
		solution(a);
	}

}
