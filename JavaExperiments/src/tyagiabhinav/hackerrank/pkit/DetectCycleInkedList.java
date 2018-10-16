/**
 * 
 */
package tyagiabhinav.hackerrank.pkit;

import java.util.HashSet;
import java.util.Set;

/**
 * @author abhinavtyagi
 *
 */
public class DetectCycleInkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.data = 1;
		
		Node node2 = new Node();
		node2.data = 2;
		
		Node node3 = new Node();
		node3.data = 3;
		
		Node node4 = new Node();
		node4.data = 4;
		
		Node node5 = new Node();
		node5.data = 5;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		System.out.println(hasCycle(node1));
		
	}
	
	static boolean hasCycleUsingSet(Node head) {
		Set<Node> seen = new HashSet<>();
	    while (head != null) {
	        seen.add(head);
	        head = head.next;
	        if (seen.contains(head)) return true;
	    }
	    return false;
	}
	
	static boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null)
				return false;
			
			slow = slow.next;
			fast = fast.next.next;
		}
	    return true;
	}
}

class Node {
    int data;
    Node next;
}
