/**
 * 
 */
package tyagiabhinav.clrs;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Heapsort {
	
	
	private static void buildMaxHeap(int[] arr) {
		for (int i = (arr.length / 2); i >= 0; i--) {
			sink(arr, i, arr.length);
		}
	}

	private static void sink(int arr[], int i, int heapSize) {
		while (2*i <= heapSize) {
			int l = 2 * i;
			if (l < (heapSize-1) && arr[l] < arr[l + 1]) {
				l++;
			}
			if (l == heapSize || (arr[i]>=arr[l])){
				break;
			}
			int temp = arr[i];
			arr[i] = arr[l];
			arr[l] = temp;
			i = l;
		}
	}
	
	public static void heapsort(int[] arr){
		buildMaxHeap(arr);
		int heapSize = arr.length;
		for(int i=(arr.length-1); i>=1; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			sink(arr, 0, --heapSize);
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

		heapsort(arr);
//		buildMaxHeap(arr);

		System.out.println("--Output--");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
