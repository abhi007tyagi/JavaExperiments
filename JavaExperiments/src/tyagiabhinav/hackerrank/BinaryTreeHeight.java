/**
 * 
 */
package tyagiabhinav.hackerrank;

import tyagiabhinav.clrs.BST;
import tyagiabhinav.util.Node;

/**
 * @author abhinavtyagi
 *
 */
public class BinaryTreeHeight {
	
	private static int height(Node root){
		int leftHeight = 0;
		int rightHeight = 0;
		if(root.left != null){
			leftHeight = 1 + height(root.left);
		}
		if(root.right != null){
			rightHeight = 1 + height(root.right);
		}
		return Math.max(leftHeight, rightHeight);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bt = new BST();
		bt.insert(5);
		bt.insert(2);
		bt.insert(1);
		bt.insert(3);
		bt.insert(4);
		bt.insert(6);
		bt.insert(9);
		bt.insert(8);
		bt.insert(7);
		bt.insert(10);
		
		bt.inorder(bt.getRoot());
		System.out.println("Height: "+height(bt.getRoot()));
	}

}
