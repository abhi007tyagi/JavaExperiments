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
				node.left.parent = node;
			}else if(val > node.val){
				node.right = put(node.right, val);
				node.right.parent = node;
			}else {
				node.val = val;
			}
			return node;
		}
	}
	
	public static Node search(Node node, int val){
		if(node == null || node.val == val){
			return node;
		}else if(val < node.val){
			return search(node.left, val); 
		}else{
			return search(node.right, val);
		}
	}
	
	public static Node search_iterative(Node node, int val){
		while(node != null && val != node.val){
			if(val < node.val){
				node = node.left;
			}else{
				node = node.right;
			}
		}
		return node;
	}
	
	public static Node treeMin(Node node){
		while(node.left!= null){
			node = node.left;
		}
		return node;
	}
	
	public static Node treeMax(Node node){
		while(node.right!= null){
			node = node.right;
		}
		return node;
	}
	
	public static Node successor(Node node){
		if(node.right != null){
			return treeMin(node.right);
		}else{
			Node p = node.parent;
			while(p != null && node == p.right){
				node = p;
				p = p.parent;
			}
			return p;
		}
	}

	public static Node predecessor(Node node){
		if(node.left != null){
			return treeMax(node.left);
		}else{
			Node p = node.parent;
			while(p != null && node == p.left){
				node = p;
				p = p.parent;
			}
			return p;
		}
	}
	public static void inorder(Node node){
		if(node != null){
			inorder(node.left);
			System.out.print(node.val+" ");
//			if(node.parent == null)
//				System.out.print(node.val+"-null | ");
//			else
//				System.out.print(node.val+"-"+node.parent.val+" | ");
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
		System.out.println("Search --> "+search(root, 8).val);
		System.out.println("Search Iterative --> "+search_iterative(root, 3).val);
		System.out.println("Tree Min --> "+treeMin(root).val);
		System.out.println("Tree Max --> "+treeMax(root).val);
		System.out.println("Successor of 7 --> "+successor(root).val);
		System.out.println("Successor of 4 --> "+successor(search(root, 4)).val);
		System.out.println("Predecessor of 7 --> "+predecessor(root).val);
		System.out.println("Predecessor of 5 --> "+predecessor(search(root, 5)).val);
	}

}
