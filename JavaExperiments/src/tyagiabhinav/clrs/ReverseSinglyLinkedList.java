/**
 * 
 */
package tyagiabhinav.clrs;

import tyagiabhinav.util.NodeS;
import tyagiabhinav.util.SinglyLinkedList;

/**
 * @author abhinavtyagi
 *
 */
public class ReverseSinglyLinkedList {

	private static NodeS tempNode, prevNode, nextNode;

	public static SinglyLinkedList reverse(SinglyLinkedList sl) {
		tempNode = sl.tail;
		prevNode = null;
		nextNode = null;
		while (tempNode != null) {
			nextNode = tempNode.next;
			tempNode.next = prevNode;
			prevNode = tempNode;
			tempNode = nextNode;
		}
		sl.tail = prevNode;
		sl.head = sl.tail;
		return sl;
	}
	
	public static void printList(SinglyLinkedList sl) {
		NodeS temp = sl.tail;
		for (int i = 0; i <= sl.getSize(); i++) {
			if (temp != null) {
				System.out.print(temp.num);
				temp = temp.next;
			}
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insert(1);
		sl.insert(2);
		sl.insert(3);
		sl.insert(4);
		sl.insert(5);
		sl.insert(6);
		sl.insert(7);
		
		
		ReverseSinglyLinkedList rsll = new ReverseSinglyLinkedList();
		rsll.printList(sl);
		sl = rsll.reverse(sl);
		rsll.printList(sl);
	}

}
