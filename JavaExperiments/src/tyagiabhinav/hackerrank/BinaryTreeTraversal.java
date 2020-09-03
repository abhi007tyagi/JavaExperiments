package tyagiabhinav.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    private void inOrder(Node root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    private void preOrder(Node root) {
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void postOrder(Node root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    private void LevelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node t = q.poll();
            System.out.print(t.data + " ");
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
        }
    }

}
