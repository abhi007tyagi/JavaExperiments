/**
 * 
 */
package tyagiabhinav.lsrc;

import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class TwoEndedStack {

	private static int top1=0, top2=0;
	private static int size;
	private static int[] arr;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();
		top2=size;
		arr = new int[size];
		
		pushFront(arr, 2);
		pushFront(arr, 5);
		pushBack(arr, 1);
		pushBack(arr, 2);
		pushBack(arr, 7);
		pushFront(arr, 6);
		popFront(arr);
		popBack(arr);
		popFront(arr);
		popBack(arr);
		popBack(arr);
		popFront(arr);
		popBack(arr);
		
		
	}
	
	public static boolean isEmpty(){
		return (top1==0 && top2==size);
	}
	
	public static void pushFront(int[] a, int n){
		if(top1<size && top1<top2){
			a[top1++]=n;
			printArray(a);
		}
		else{
			System.out.println("Stack Full !!");
			printArray(a);
		}
	}
	
	public static int popFront(int[] a){
		if(top1>0){
			int p = a[--top1];
			a[top1] = 0;
			System.out.println("PopFront->"+p);
			printArray(a);
			return p;
		}
		else{
			System.out.println("Stack1 Empty !!");
			printArray(a);
		}
		return -1;
	}
	
	public static void pushBack(int[] a, int n){
		if(top2>0 && top2>top1){
			a[--top2]=n;
			printArray(a);
		}
		else{
			System.out.println("Stack Full !!");
			printArray(a);
		}
	}
	
	public static int popBack(int[] a){
		if(top2<=(size-1)){
			int p = a[top2];
			a[top2++] = 0;
			System.out.println("PopBack->"+p);
			printArray(a);
			return p;
		}
		else{
			System.out.println("Stack2 Empty !!");
			printArray(a);
		}
		return -1;
	}
	
	
	
	public static void printArray(int[] arr) {
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------");
	}

}
