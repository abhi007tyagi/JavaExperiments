/**
 * 
 */
package tyagiabhinav.util;

/**
 * @author abhinavtyagi
 *
 */
public class Node {

	public int val;
	public Node next,prev,parent,left,right;
	
	public Node(int n){
		this.val = n;
		this.next = this.prev = this.parent = this.left = this.right = null;
	}

}
