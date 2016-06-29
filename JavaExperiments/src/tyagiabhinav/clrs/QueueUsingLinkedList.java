/**
 * 
 */
package tyagiabhinav.clrs;

import tyagiabhinav.util.NodeS;

/**
 * @author abhinavtyagi
 *
 */
public class QueueUsingLinkedList {

	private static NodeS head = null;
	private static NodeS tail = null;

	public static void enqueue(int n) {
		NodeS node = new NodeS(n);
		node.next = null;
		if (tail == null) {
			tail = node;
		} else {
			head.next = node;
		}
		head = node;
	}

	public static int dequeue() {
		if (!isEmpty()) {
			NodeS deq = tail;
			tail = deq.next;
			return deq.num;
		} else {
			System.out.println("Queue Empty !!");
		}
		return -1;
	}

	public static boolean isEmpty() {
		return tail == null;
	}

	public void printList() {
		NodeS temp = tail;
		while (temp != null) {
			System.out.print(temp.num);
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueUsingLinkedList qull = new QueueUsingLinkedList();
		qull.enqueue(1);
		qull.enqueue(2);
		qull.enqueue(3);
		qull.enqueue(4);
		qull.enqueue(5);
		qull.enqueue(6);
		qull.enqueue(7);
		qull.printList();
		System.out.println("DQ->" + qull.dequeue());
		qull.enqueue(8);
		qull.printList();
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		System.out.println("DQ->" + qull.dequeue());
		qull.enqueue(9);
		qull.enqueue(10);
		qull.printList();

	}

}
