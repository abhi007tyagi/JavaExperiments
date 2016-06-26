/**
 * 
 */
package tyagiabhinav.lsrc;

/**
 * @author abhinavtyagi
 *
 */
public class Queue {

	private static int tail = 0;
	private static int head = 0;
	private static int[] arr;
	private static int size;
	private static int filledSize = 0;

	Queue(int s) {
		this.size = s;
		arr = new int[this.size];
	}

	public static boolean isEmpty() {
		return tail == 0 && head == 0;
	}

	public static void enqueue(int n) {
		if (filledSize < size) {
			arr[tail] = n;
			filledSize++;
			if (tail == (size - 1)) {
				tail = 0;
			} else {
				tail++;
			}
		} else {
			System.out.println("Queue full !!");
		}
		printArray(arr);
	}

	public static int dequeue() {
		if (filledSize==0) {
			System.out.println("Queue empty !!");
			return -1;
		}
		int p = arr[head];
		arr[head] = 0;
		filledSize--;
		if (head == (size - 1)) {
			head = 0;
		} else {
			head++;
		}
		return p;
	}

	public static void printArray(int[] arr) {
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue Q = new Queue(10);
		System.out.println("DQ-->" + Q.dequeue());
		Q.enqueue(1);
		Q.enqueue(2);
		Q.enqueue(3);
		System.out.println("DQ-->" + Q.dequeue());
		Q.enqueue(4);
		Q.enqueue(5);
		Q.enqueue(6);
		Q.enqueue(7);
		Q.enqueue(8);
		System.out.println("DQ-->" + Q.dequeue());
		System.out.println("DQ-->" + Q.dequeue());
		Q.enqueue(9);
		Q.enqueue(10);
		Q.enqueue(11);
		System.out.println("DQ-->" + Q.dequeue());
		Q.enqueue(12);
		Q.enqueue(13);
		Q.enqueue(14);
		Q.enqueue(15);
		System.out.println("DQ-->" + Q.dequeue());
		Q.enqueue(16);
		Q.enqueue(17);
	}

}
