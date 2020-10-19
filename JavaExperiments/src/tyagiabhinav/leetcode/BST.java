package tyagiabhinav.leetcode;

import java.util.*;

public class BST {

    static Stack<TreeNode> stack;
    private static void inorder(TreeNode root){
        // This is correct out put [3,7,9,15,20]
        if(root != null){
            if(root.left != null) inorder(root.left);
            System.out.print(root.val+" ");
            if(root.right != null) inorder(root.right);
        }
    }

    private static void inorderStack(TreeNode root){
        // This is correct out put [3,7,9,15,20]
        stack = new Stack<>();
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            } else{
                curr = stack.pop();
                System.out.print(curr.val+" ");
                curr = curr.right;
            }
        }
    }

    private static void preorder(TreeNode root){
        // This is correct out put [7,3,15,9,20]
        if(root != null){
            System.out.print(root.val+" ");
            if(root.left != null) preorder(root.left);
            if(root.right != null) preorder(root.right);
        }
    }

    private static void preorderStack(TreeNode root){
        // This is correct out put [7,3,15,9,20]
        stack = new Stack<>();
        TreeNode curr = root;
        stack.push(curr);
        while(!stack.isEmpty()){
            curr = stack.pop();
            System.out.print(curr.val+" ");
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }

    private static void postorder(TreeNode root){
        // This is correct out put [3,9,20,15,7]
        if(root != null){
            if(root.left != null) postorder(root.left);
            if(root.right != null) postorder(root.right);
            System.out.print(root.val+" ");
        }
    }

    private static void postorderStack(TreeNode root){
        // This is correct out put [3,9,20,15,7]
        stack = new Stack<>();
        stack.push(root);
        Stack<Integer> postOrder = new Stack<>();
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            postOrder.push(curr.val);

            if(curr.left != null){
                stack.push(curr.left);
            }
            if(curr.right != null){
                stack.push(curr.right);
            }
        }
        while(!postOrder.isEmpty()){
            System.out.print(postOrder.pop()+" ");
        }
    }

    Map<Integer, Map<Integer, Set<Integer>>> xMap = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root != null){
            verticalTraversalDFS(root, 0, 0);
            // Map<Integer, Map<Integer, Set<Integer>>> temp = xMap;
            for(int i: xMap.keySet()){
                Map<Integer, Set<Integer>> map = xMap.get(i);
                List<Integer> l = new ArrayList<>();
                for(int j: map.keySet()){
                    Set<Integer> set = map.get(j);
                    for(int num : set)
                        l.add(num);
                }
                list.add(l);
            }
        }
        return list;
    }

    private void verticalTraversalDFS(TreeNode root, int x, int y){
        Map<Integer, Set<Integer>> yMap = xMap.getOrDefault(x, new TreeMap<>());
        Set<Integer> set = yMap.getOrDefault(y, new TreeSet<>());

        set.add(root.val);
        yMap.put(y,set);
        xMap.put(x, yMap);

        if(root.left != null) verticalTraversalDFS(root.left, x-1, y+1);
        if(root.right != null) verticalTraversalDFS(root.right, x+1, y+1);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(7);
        tree.left = new TreeNode(3, null, null);
        tree.right = new TreeNode(15, new TreeNode(9, null,null), new TreeNode(20,null,null));


//        inorder(tree);
//        System.out.println("\n*************");
//        inorderStack(tree);
//        System.out.println("\n*************");
//        preorder(tree);
//        System.out.println("\n*************");
//        preorderStack(tree);
//        System.out.println("\n*************");
//        postorder(tree);
//        System.out.println("\n*************");
//        postorderStack(tree);
//        System.out.println("\n*************");
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
