package tyagiabhinav.leetcode;

import java.util.Stack;

public class RemoveAllAdjecentDuplicateString {

    public static String removeDuplicates(String S) {
        StringBuilder strB = new StringBuilder();
        int len = 0;
        for(Character ch: S.toCharArray()){
            if(len !=0 && ch == strB.charAt(len-1)){
                strB.deleteCharAt(len-- -1);
            } else{
                strB.append(ch);
                len++;
            }
        }
        return strB.toString();
    }

    public static String bruteRemoveDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (!stack.isEmpty() && stack.peek() != S.charAt(i))
                stack.push(S.charAt(i));
            else if(!stack.isEmpty())
                stack.pop();
            else
                stack.push(S.charAt(i));
        }

        StringBuilder strB = new StringBuilder();
        while (!stack.isEmpty()) {
            strB.append(stack.pop());
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
