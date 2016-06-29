/**
 * 
 */
package tyagiabhinav.clrs;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class MaxHeap {

	public static void buildMaxHeap(int[] arr) {
		for (int i = (arr.length / 2); i >= 0; i--) {
			maxHeapifyRecursive(arr, i);
//			sink(arr, i);
		}
	}

	public static void maxHeapifyRecursive(int[] arr, int i) {
		int l = 2 * i;
		int r = 2 * i + 1;
		int largest = -1;
		if (l < arr.length && arr[l] > arr[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r < arr.length && arr[r] > arr[largest]) {
			largest = r;
		}
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapifyRecursive(arr, largest);
		}
	}

	private static void sink(int arr[], int i) {
		while (2*i <= arr.length) {
			int l = 2 * i;
			if (l < (arr.length-1) && arr[l] < arr[l + 1]) {
				l++;
			}
			if (l == arr.length || (arr[i]>arr[l])){
				break;
			}
			int temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;
			i = l;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("--Input--");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		buildMaxHeap(arr);

		System.out.println("--Output--");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
