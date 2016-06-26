/**
 * 
 */
package tyagiabhinav.lsrc;

import tyagiabhinav.util.SinglyLinkedList;

/**
 * @author abhinavtyagi
 *
 */
public class StackUsingLinkedList {

	private static SinglyLinkedList sll = new SinglyLinkedList();

	public static void push(int n) {
		sll.insert(n);
	}

	public static int pop() {
		if (!sll.isEmpty()) {
			return sll.delete().num;
		}else{
			System.out.println("Stack Empty!");
			return -1;
		}
	}
	
	public static void printStack(){
		sll.printList();
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
		sull.printStack();
		System.out.println("Pop->"+sull.pop());
		sull.push(8);
		sull.printStack();
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		System.out.println("Pop->"+sull.pop());
		sull.push(9);
		sull.push(10);
		sull.printStack();
	}

}
