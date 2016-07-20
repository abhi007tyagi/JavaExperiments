/**
 * 
 */
package tyagiabhinav.clrs;

import tyagiabhinav.util.Node;

/**
 * @author abhinavtyagi
 *
 */
public class BST {
	
	private static Node root;
	private static int size;
	
	public static void insert(int num){
		root = put(root, num);
		size++;
	}
	
	private static Node put(Node node, int val){
		if(node == null){
			return new Node(val);
		}else{
			if(val < node.val){
				node.left = put(node.left, val);
			}else if(val > node.val){
				node.right = put(node.right, val);
			}else {
				node.val = val;
			}
			return node;
		}
	}
	
	public static void inorder(Node node){
		if(node != null){
			inorder(node.left);
			System.out.print(node.val+" ");
			inorder(node.right);
		}
	}
	
	public static void preorder(Node node){
		if(node != null){
			System.out.print(node.val+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public static void postorder(Node node){
		if(node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.val+" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(7);
		bst.insert(3);
		bst.insert(9);
		bst.insert(4);
		bst.insert(6);
		bst.insert(1);
		bst.insert(10);
		bst.insert(8);
		bst.insert(5);
		System.out.println("Size: "+size);
		bst.inorder(root);
		System.out.println("\n--------");
		bst.preorder(root);
		System.out.println("\n--------");
		bst.postorder(root);
		System.out.println("\n--------");
	}

}
