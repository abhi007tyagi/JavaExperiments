/**
 * 
 */
package tyagiabhinav.lsrc;

import tyagiabhinav.util.NodeS;

/**
 * @author abhinavtyagi
 *
 */
public class StackUsingLinkedList {

	private static NodeS top = null;

	public static void push(int n) {
		NodeS node = new NodeS(n);
		node.next = top;
		top = node;
	}

	public static int pop() {
		if (!isEmpty()) {
			NodeS del = top;
			top = del.next;
			return del.num;
		} else {
			System.out.println("Stack Empty!");
			return -1;
		}
	}

	public static boolean isEmpty() {
		return top == null;
	}

	public void printList() {
		NodeS temp = top;
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
		StackUsingLinkedList sull = new StackUsingLinkedList();
		sull.push(1);
		sull.push(2);
		sull.push(3);
		sull.push(4);
		sull.push(5);
		sull.push(6);
		sull.push(7);
		sull.printList();
		System.out.println("Pop->" + sull.pop());
		sull.push(8);
		sull.printList();
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		System.out.println("Pop->" + sull.pop());
		sull.push(9);
		sull.push(10);
		sull.printList();
	}

}
