/**
 * 
 */
package tyagiabhinav;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Input Array");
		printArray(arr);
		System.out.println("\nSorted Array");
		printArray(insertionSort(arr));
	}
	
	public static int[] insertionSort(int[] arr){
		// Do insertion sort
		int arrayLength = arr.length;
		for(int j=1; j<arrayLength; j++){
			int key = arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		return arr;
	}
	
	public static void printArray(int[] arr){
		int arrayLength = arr.length;
		for(int i=0; i<arrayLength; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
