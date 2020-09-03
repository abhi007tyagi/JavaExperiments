package tyagiabhinav.leetcode;

import java.util.*;

public class RemoveInvalidParentheses {
    private static Map<Character, Character> getOpp = new HashMap<>(6);

    static {
        getOpp.put(')', '(');
        getOpp.put('}', '{');
        getOpp.put(']', '[');
    }

    public static boolean isValid(String s) {
        int size = s.length();
        if (size == 0) return true;
//        if (size % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == ')') {
                if (stack.empty()) stack.push(ch);
                else if (stack.peek() == getOpp.get(ch)) stack.pop();
                else stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static List<String> removeInvalidParentheses(String s) {
        int size = s.length();
        if (size <= 1) return Arrays.asList("");
        Set<String> set = new HashSet<>();
        for (int i = 1; i < size; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == ')') {
                String str = s.substring(0, i - 1) + s.substring(i, size);
                if (isValid(str)) {
                    set.add(str);
                }
            }
        }
        List<String> list = new ArrayList<>(set.size());
        for (String st : set) {
            list.add(st);
        }
        if(list.isEmpty()) list.add("");
        return list;
    }

    public static void main(String[] args) {
//        String str = "(a)())()";
        String str = ")(";
        System.out.println(removeInvalidParentheses(str));
    }
}
