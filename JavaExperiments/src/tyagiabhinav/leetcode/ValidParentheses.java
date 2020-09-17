package tyagiabhinav.leetcode;

import java.util.*;

public class ValidParentheses {

    private static Map<Character,Character> getOpp = new HashMap<>(6);
    static{
        getOpp.put(')','(');
        getOpp.put('}','{');
        getOpp.put(']','[');
    }

//    public static boolean isValid(String s) {
//        int size = s.length();
//        if(size == 0) return true;
//        if(size%2 != 0) return false;
//        Stack<Character> stack = new Stack<>();
//        for(int i=0; i<size; i++){
//            switch(s.charAt(i)){
//                case ')': if(stack.isEmpty() || stack.pop() != '(') return false;
//                    break;
//                case ']': if(stack.isEmpty() || stack.pop() != '[') return false;
//                    break;
//                case '}': if(stack.isEmpty() || stack.pop() != '{') return false;
//                    break;
//                default: stack.push(s.charAt(i));
//                    break;
//            }
//        }
//        return stack.isEmpty();
//    }

    public static boolean isValid(String s) {
        int size = s.length();
        if(size == 0) return true;
        if(size%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<size; i++){
            char ch = s.charAt(i);
            if(stack.empty()) stack.push(ch);
            else if(stack.peek() == getOpp.get(ch)) stack.pop();
            else stack.push(ch);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("({[]})"));
//        System.out.println(isValid("(({]])"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid(")("));

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(8);

        List<Integer> list = new ArrayList<>();

        stack.remove(1);
        stack.get(8);
        System.out.println(stack.toString());
    }
}
