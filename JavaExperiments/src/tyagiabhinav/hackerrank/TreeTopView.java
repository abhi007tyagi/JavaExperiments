/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

import tyagiabhinav.clrs.BST;
import tyagiabhinav.util.Node;

/**
 * @author abhinavtyagi
 *
 */
public class TreeTopView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(7);
		bst.insert(5);
		bst.insert(6);
		bst.insert(3);
		bst.insert(4);
		bst.insert(9);
		bst.insert(8);
		bst.insert(11);
		bst.insert(10);

//		bst.inorder(bst.getRoot());
		top_view(bst.getRoot());

	}

	private static void top_view(Node root) {
		System.out.println(moveLeft(root.left));
		System.out.println(root.val);
		moveRight(root.right);
	}

	// recursively move and print left branch. This way last entry will print first.
	private static int moveLeft(Node node) {
		if (node.left != null) {
			System.out.println(moveLeft(node.left));
		}
		return node.val;
	}

	// print and then call recursively to print in order
	private static void moveRight(Node node) {
		System.out.println(node.val);
		if (node.right != null) {
			moveRight(node.right);
		}
	}

}
