/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author abhinavtyagi
 *
 */
public class BalancedBrackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			boolean isBalanced = false;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char item = s.charAt(i);
				char popItem = '@';
				switch (item) {
				case '{':
				case '[':
				case '(':
					stack.push(item);
					break;
				case '}':
				case ']':
				case ')':
					if (!stack.isEmpty()) {
						popItem = stack.pop();
					}else{
						popItem = 'X';
					}
					break;
				}
				if (popItem != '@') {
					if (isMatch(item, popItem)) {
						isBalanced = true;
					} else {
						isBalanced = false;
						break;
					}
				}else if(popItem == 'X'){
					isBalanced = false;
					break;
				}
			}
			if (isBalanced && stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isMatch(char close, char open) {
		switch (open) {
		case '{':
			if (close == '}')
				return true;
			else
				return false;
		case '[':
			if (close == ']')
				return true;
			else
				return false;
		case '(':
			if (close == ')')
				return true;
			else
				return false;
		default:
			return false;
		}
	}

}
