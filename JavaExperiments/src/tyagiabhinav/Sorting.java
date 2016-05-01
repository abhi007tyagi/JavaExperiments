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
		printArray(selectionSort(arr));
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
	
	public static int[] reverseInsertionSort(int[] arr){
		// Do reverse insertion sort
		int arrayLength = arr.length;
		for(int j=arrayLength-2; j>=0; j--){
			int key = arr[j];
			int i = j+1;
			while(i<=(arrayLength-1) && arr[i]>key){
				arr[i-1] = arr[i];
				i++;
			}
			arr[i-1] = key;
		}
		return arr;
	}
	
	public static int[] selectionSort(int[] arr){
		// Do selection sort
		int arraySize = arr.length;
		for(int j=0; j<arraySize; j++){
			int small = arr[j];
			for(int i=j+1; i<arraySize; i++){
				if(arr[i]<small){
					int temp = small;
					small = arr[i];
					arr[i] = temp;
				}
			}
			arr[j] = small;
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
