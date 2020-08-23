package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private static Map<Character,Character> getOpp = new HashMap<>(6);
    static{
        getOpp.put('(',')');
        getOpp.put(')','(');
        getOpp.put('{','}');
        getOpp.put('}','{');
        getOpp.put('[',']');
        getOpp.put(']','[');
    }
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
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("(({]])"));
        System.out.println(isValid("(]"));
    }
}
