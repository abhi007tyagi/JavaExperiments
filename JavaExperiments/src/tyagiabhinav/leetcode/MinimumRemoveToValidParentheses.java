package tyagiabhinav.leetcode;


import java.util.*;

public class MinimumRemoveToValidParentheses {
    public static String minRemoveToMakeValid(String s) {
        int size = s.length();
        Set<Integer> posToRemove = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    posToRemove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) posToRemove.add(stack.pop());

        if (posToRemove.isEmpty()) return s;
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (!posToRemove.contains(i)) {
                strB.append(s.charAt(i));
            }
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(minRemoveToMakeValid("a)b(c)d"));
        System.out.println(minRemoveToMakeValid("))(("));
        System.out.println(minRemoveToMakeValid("(a(b(c)d)"));
        System.out.println(minRemoveToMakeValid(")))t((u)"));
        System.out.println(minRemoveToMakeValid(")))tes(t))"));
        System.out.println(minRemoveToMakeValid("(((t(e)s(t)"));
    }
}
