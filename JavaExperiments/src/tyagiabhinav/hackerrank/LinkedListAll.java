/**
 * 
 */
package tyagiabhinav.hackerrank;

import tyagiabhinav.util.Node;
import java.util.Stack;

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
		head = InsertNth(head, 27, 1);
		head = InsertNth(head, 9, 0);
		head = InsertNth(head, 7, 2);
		printList(head);
		System.out.println();

//		ReversePrint(head);
		head = Reverse(head);
		printList(head);
		System.out.println();

		head = DeleteNth(head, 1);
		printList(head);
		System.out.println();

		head = DeleteNth(head, 0);
		printList(head);
		System.out.println();

		head = DeleteNth(head, 3);
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

	public static Node DeleteNth(Node head, int position) {

		if (head == null) {
			return null;
		} else if (position == 0 && head.next == null) {
			return null;
		} else if (position == 0 && head.next != null) {
			head = head.next;
			return head;
		} else {
			int i = 0;
			Node temp = head;
			while (i < position - 1 && temp.next != null) {
				temp = temp.next;
				i++;
			}

			Node node = temp.next;
			temp.next = node.next;
			node = null;
			return head;
		}
	}

	public static void ReversePrint(Node head) {
		Stack stack = new Stack<>();
		while (head != null) {
			stack.add(head.data + " ");
			head = head.next;
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	public static Node Reverse(Node head) {

		if (head == null) {
			return null;
		} else {
			Node currentNode = head;
			Node prevNode = null;
			Node nextNode = head.next;
			
			while (nextNode != null){
				Node temp = prevNode;
				prevNode = currentNode;
				currentNode = nextNode;
				prevNode.next = temp;
				nextNode = nextNode.next;
				currentNode.next = prevNode;
			}
			return currentNode;
		}
	}
	
	public static int CompareLists(Node headA, Node headB) {
	    if(headA == null && headB == null){
	        return 1;
	    } else if(headA == null && headB != null){
	        return 0;
	    } else if(headA != null && headB == null){
	        return 0;
	    } else {
	        while(headA != null && headB != null){
	            if(headA.data == headB.data){
	            	if(!(headA.next==null ^ headB.next==null)){
	                    headA = headA.next;
	                    headB = headB.next;
	                }else{
	                    return 0;
	                }
	            }else{
	                return 0;
	            }
	        } 
	        return 1;
	    } 
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
