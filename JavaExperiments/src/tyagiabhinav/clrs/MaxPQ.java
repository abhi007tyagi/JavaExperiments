/**
 * 
 */
package tyagiabhinav.clrs;

/**
 * @author abhinavtyagi
 *
 */
public class MaxPQ {
	
	static int heapSize;
	static int[] arr;
	
	MaxPQ(int size){
		this.arr = new int[size];
		this.heapSize=0;
	}
	
	public static int getMax(int[] arr){
		return arr[0];
	}
	
	public static int extractMax(int[] arr){
		if(heapSize<1){
			System.out.println("Empty Heap");
			return -1;
		}else{
			int max = arr[0];
			arr[0] = arr[--heapSize];
			sink(arr, 0);
			return max;
		}
	}
	
	public static void increaseKey(int[] arr, int i, int key){
		if(key <arr[i]){
			System.out.println("Key is smaller than current key");
		}else{
			arr[i] = key;
			while(i>0 && arr[i/2]<arr[i]){
				int temp = arr[i];
				arr[i] = arr[i/2];
				arr[i/2] = temp;
				i = i/2;
			}
		}
	}
	
	public static void insertIntoHeap(int[] arr, int key){
		if(heapSize < arr.length){
			arr[heapSize] = -1;
			increaseKey(arr, heapSize++, key);
		}else{
			System.out.println("Heap is full !!");
		}
	}
	
	private static void sink(int arr[], int i) {
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
	
	public static void printHeap(){
		for(int i=0; i<heapSize; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxPQ maxPQ = new MaxPQ(10);
		maxPQ.insertIntoHeap(arr, 19);
		maxPQ.insertIntoHeap(arr, 2);
		maxPQ.insertIntoHeap(arr, 9);
		maxPQ.insertIntoHeap(arr, 1);
		maxPQ.insertIntoHeap(arr, 6);
		maxPQ.insertIntoHeap(arr, 14);
		maxPQ.insertIntoHeap(arr, 7);
		maxPQ.insertIntoHeap(arr, 5);
		maxPQ.insertIntoHeap(arr, 4);
		maxPQ.insertIntoHeap(arr, 3);
		maxPQ.insertIntoHeap(arr, 13);
		maxPQ.insertIntoHeap(arr, 16);
		printHeap();
		System.out.println("Max->"+maxPQ.getMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		maxPQ.insertIntoHeap(arr, 21);
		maxPQ.insertIntoHeap(arr, 10);
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		System.out.println("Extract Max->"+maxPQ.extractMax(arr));
		printHeap();
		maxPQ.insertIntoHeap(arr, 27);
		printHeap();
		
	}

}
