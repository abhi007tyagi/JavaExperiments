/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author abhinavtyagi
 *
 */
public class EqualStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		int aSize = 0;
		int bSize = 0;
		int cSize = 0;

		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			aSize += h1[h1_i];
		}

		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			bSize += h2[h2_i];
		}

		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			cSize += h3[h3_i];
		}

		Stack<Integer> stk1 = new Stack<>();
		stk1 = getStack(h1);

		Stack<Integer> stk2 = new Stack<>();
		stk2 = getStack(h2);

		Stack<Integer> stk3 = new Stack<>();
		stk3 = getStack(h3);

//		System.out.println("STK1" + stk1.toString());
//		System.out.println("STK2" + stk2.toString());
//		System.out.println("STK3" + stk3.toString());

		if (n1 < n2) {
			if (n1 < n3) {
				// n1 small
				getHeight(stk1, stk2, stk3, aSize, bSize, cSize);
			} else {
				// n3 small
				getHeight(stk3, stk1, stk2, cSize, aSize, bSize);
			}
		} else if (n2 < n3) {
			// n2 small
			getHeight(stk2, stk1, stk3, bSize, aSize, cSize);
		} else {
			// n3 small
			getHeight(stk3, stk1, stk2, cSize, aSize, bSize);
		}

	}

	private static void getHeight(Stack<Integer> stk, Stack<Integer> stk1, Stack<Integer> stk2, int smallSize,
			int arr1Size, int arr2Size) {
		int height = 0;
		while (!stk.isEmpty()) {
			if (smallSize == arr1Size && smallSize == arr2Size) {
				height = smallSize;
				break;
			} else {
				smallSize -= stk.pop();
				while (arr1Size > smallSize) {
					arr1Size -= stk1.pop();
				}
				while (arr2Size > smallSize) {
					arr2Size -= stk2.pop();
				}
			}
		}
		System.out.println(height);
	}

	private static Stack<Integer> getStack(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			stk.push(arr[i]);
		}
		return stk;
	}
}
