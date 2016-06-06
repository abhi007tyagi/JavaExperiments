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
		mergeSort(arr,0,size);
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
	
	public static void mergeSort(int[] arr, int p, int r){
		if(p<r){
			int q=(p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			printArray(merge(arr, p, q, r));
		}
	}
	
	public static int[] merge(int[] arr, int p, int q, int r){
		int n1 = q-p;
		int n2 = r-q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i=0; i<n1; i++){
			L[i] = arr[p+i];
		}
		for(int i=0;i<n2;i++){
			R[i] = arr[q+i];
		}
		
		int i=0;
		int j=0;
		for(int k=p; k<r; k++){
			if(i<n1 && L[i]<=R[j]){
				arr[k] = L[i];
				i++;
			}else if(j<n2){
				arr[k] = R[j];
				j++;
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr){
		int arrayLength = arr.length;
		for(int i=0; i<arrayLength; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("------");
	}

}
