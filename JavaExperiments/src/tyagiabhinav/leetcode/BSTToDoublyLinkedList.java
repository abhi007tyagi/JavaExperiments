package tyagiabhinav.leetcode;

public class BSTToDoublyLinkedList {

    static Node first = null;
    static Node last = null;
    public static Node treeToDoublyList(Node root) {
        if(root == null) return root;
        convert(root);
        last.right = first;
        first.left = last;
        return first;
    }

    private static void convert(Node root){
        if(root != null){
            inorder(root.left);
            if(last != null) {
                last.right = root;
                root.left = last;
            } else {
                first = root;
            }
            last = root;
            inorder(root.right);
        }
    }

    private static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

//        Node two = new Node(2, new Node(1), new Node(3));
//        Node five = new Node(5);
//        Node root = new Node(4, two, five);
//        inorder(root);
//        treeToDoublyList(root);

        int[] arr = {1,2,3,4};
        int[] trr = {1,2,3,4};

        System.out.println(arr.equals(trr));
    }


    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}