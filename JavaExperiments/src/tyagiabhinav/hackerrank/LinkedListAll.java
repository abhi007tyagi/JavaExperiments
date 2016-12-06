/**
 * 
 */
package tyagiabhinav.hackerrank;

import tyagiabhinav.util.Node;

/**
 * @author abhinavtyagi
 *
 */
public class LinkedListAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node head = null;
		head = InsertNth(head, 10, 0);
		// printList(head);
		head = InsertNth(head, 2, 0);
		// printList(head);
		head = InsertNth(head, 16, 0);
		printList(head);
		// System.out.println((head = InsertNth(head, 10, 0)).data);
		// System.out.println((head = InsertNth(head, 2, 0)).data);
		// System.out.println((head = InsertNth(head, 27, 0)).data);
	}

	public static Node InsertTail(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node newItem = new Node();
		newItem.data = data;
		newItem.next = null;

		if (head != null) {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newItem;
		} else {
			head = newItem;
		}

		return head;
	}

	public static Node InsertHead(Node head, int x) {
		Node node = new Node();
		node.data = x;

		node.next = head;

		head = node;

		return head;
	}

	public static Node InsertNth(Node head, int data, int position) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			node.next = null;
			return node;
		} else if (position == 0) {
			node.next = head;
			return node;
		} else {
			int i = 0;
			Node temp = head;
			while (i < position - 1 && temp.next != null) {
				temp = temp.next;
				i++;
			}

			Node nodeNew = temp.next;
			temp.next = node;
			temp = temp.next;
			temp.next = nodeNew;
			return head;
		}
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
