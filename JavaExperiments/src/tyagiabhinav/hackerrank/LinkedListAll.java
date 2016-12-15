/**
 * 
 */
package tyagiabhinav.hackerrank;

import tyagiabhinav.util.Node;

import java.util.HashSet;
import java.util.Set;
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
		head = SortedInsert(head, 1);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 2);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 3);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 4);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 5);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 6);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 8);
		printList(head);
		System.out.println();
		head = SortedInsert(head, 7);
		printList(head);
		System.out.println();
		// head = InsertNth(head, 90, 0);
		// // printList(head);
		// head = InsertNth(head, 80, 0);
		// // printList(head);
		// head = InsertNth(head, 60, 0);
		// head = InsertNth(head, 60, 0);
		// head = InsertNth(head, 60, 0);
		// head = InsertNth(head, 30, 0);
		// head = InsertNth(head, 30, 0);
		// head = InsertNth(head, 20, 0);
		//
		// head = InsertNth(head, 10, 0);
		// printList(head);
		// System.out.println();
		//
		// head = RemoveDuplicates(head);
		// printList(head);
		// System.out.println();

		// Node head2 = null;
		// head2 = InsertNth(head2, 100, 0);
		// // printList(head);
		// head2 = InsertNth(head2, 30, 0);
		// // printList(head);
		// head2 = InsertNth(head2, 15, 0);
		// head2 = InsertNth(head2, 7, 0);
		// printList(head2);
		// System.out.println();
		//
		// Node head3 = null;
		// head3 = MergeLists(head, head2);
		// printList(head3);
		// System.out.println();

		// ReversePrint(head);
		// head = Reverse(head);
		// printList(head);
		// System.out.println();
		//
		// head = DeleteNth(head, 1);
		// printList(head);
		// System.out.println();
		//
		// head = DeleteNth(head, 0);
		// printList(head);
		// System.out.println();
		//
		// head = DeleteNth(head, 3);
		// printList(head);
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

			while (nextNode != null) {
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
		if (headA == null && headB == null) {
			return 1;
		} else if (headA == null && headB != null) {
			return 0;
		} else if (headA != null && headB == null) {
			return 0;
		} else {
			while (headA != null && headB != null) {
				if (headA.data == headB.data) {
					if (!(headA.next == null ^ headB.next == null)) {
						headA = headA.next;
						headB = headB.next;
					} else {
						return 0;
					}
				} else {
					return 0;
				}
			}
			return 1;
		}
	}

	public static Node MergeLists(Node headA, Node headB) {
		if (headA == null) {
			return headB;
		} else if (headB == null) {
			return headA;
		} else {
			Node newNode = null;
			Node prevNode = null;
			Node firstNode = null;
			while (headA != null && headB != null) {
				if (headA.data < headB.data) {
					newNode = headA;
					headA = headA.next;
				} else {
					newNode = headB;
					headB = headB.next;
				}
				if (prevNode != null) {
					prevNode.next = newNode;
				} else {
					firstNode = newNode;
				}
				prevNode = newNode;
				newNode = newNode.next;
			}
			if (headA != null) {
				prevNode.next = headA;
			} else if (headB != null) {
				prevNode.next = headB;
			}
			return firstNode;
		}
	}

	public static int GetNode(Node head, int n) {
		if (head == null) {
			return -1;
		} else {
			Stack stack = new Stack<>();
			while (head != null) {
				stack.add(head.data);
				head = head.next;
			}
			int i = 0;
			while (!stack.isEmpty()) {
				if (i++ == n) {
					return (int) stack.pop();
				} else {
					stack.pop();
				}
			}
			return -1;
		}
	}

	public static Node RemoveDuplicates(Node head) {
		if (head == null) {
			return null;
		} else {
			Node currNode = head;
			while (currNode != null) {
				Node temp = currNode;
				Node testNode = temp;
				temp = temp.next;
				Node prevNode = testNode;
				while (temp != null) {
					if (testNode.data == temp.data) {
						prevNode.next = temp.next;
					}
					temp = temp.next;
				}
				currNode = currNode.next;
			}
			return head;
		}
	}

	public static boolean hasCycle(Node head) {
		if (head == null) {
			return false;
		} else {
			Set<Node> set = new HashSet<>();
			while (head != null) {
				if (set.contains(head)) {
					return true;
				} else {
					set.add(head);
					head = head.next;
				}
			}
			return false;
		}
	}

	public static boolean hasCycleOptimized(Node head) {
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			head = head.next;

			if (head.equals(fast)) {
				return true;
			}
		}
		return false;
	}

	public static int FindMergeNode(Node headA, Node headB) {
		if (headA == null || headB == null) {
			return -1;
		}
		Set<Node> set = new HashSet<>();
		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (set.contains(headB)) {
				return headB.data;
			} else {
				headB = headB.next;
			}
		}
		return -1;
	}

	public static Node SortedInsert(Node head, int data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			node.next = null;
			node.prev = null;
			return node;
		} else {
			Node temp = head;
			while (temp.data < data) {
				if(temp.next == null){
					node.next = null;
					node.prev = temp;
					temp.next = node;
					return head;
				}
				temp = temp.next;
			}

			Node prevNode = temp.prev;
			prevNode.next = node;
			node.prev = prevNode;
			node.next = temp;
			temp.prev = node;
			return head;
		}
	}
	
	public static Node ReverseDoubly(Node head) {
	    if (head == null) {
	        return null;
	    } else {
	        Node currentNode = head;
	        Node prevNode = head.prev;
	        Node nextNode = head.next;

	        while (nextNode != null) {
	            Node temp = prevNode;
	            prevNode = currentNode;
	            currentNode = nextNode;
	            prevNode.next = temp;
	            nextNode = nextNode.next;
	            currentNode.next = prevNode;
	            currentNode.prev = nextNode;
	            prevNode.prev = currentNode;
	        }
	        return currentNode;
	    }
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
