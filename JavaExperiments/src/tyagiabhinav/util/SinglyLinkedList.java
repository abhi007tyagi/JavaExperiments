/**
 * 
 */
package tyagiabhinav.util;

/**
 * @author abhinavtyagi
 *
 */
public class SinglyLinkedList {
	
	private NodeS head = null;
	
	public void insert(int n){
		NodeS node = new NodeS(n);
		node.next = head;
		head = node;
	}
	
	public NodeS delete(){
		NodeS del = head;
		head = del.next;
		return del;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void printList(){
		NodeS temp = head;
		while(temp != null){
			System.out.print(temp.num);
			temp = temp.next;
		}
		System.out.println();
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insert(1);
		sll.insert(2);
		sll.insert(3);
		sll.insert(4);
		sll.insert(5);
		sll.printList();
		System.out.println("Del->"+sll.delete().num);
		System.out.println("Del->"+sll.delete().num);
		System.out.println("Del->"+sll.delete().num);
		sll.printList();
	}

}
