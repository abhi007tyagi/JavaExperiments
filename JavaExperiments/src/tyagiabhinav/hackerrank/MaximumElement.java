/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.Scanner;

import tyagiabhinav.util.NodeS;

/**
 * @author abhinavtyagi
 *
 */
public class MaximumElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack stk = new Stack();
		for (int i = 0; i < N; i++) {
			int type = sc.nextInt();
			switch (type) {
			case 1:
				stk.push(sc.nextInt());
				break;
			case 2:
				stk.pop();
				break;
			case 3:
				System.out.println(stk.getMax());
				break;
			}
		}
	}
}

class Node {

	public int num;
	public Node next;

	public Node(int n) {
		this.num = n;
	}
}

class Stack {

	private Node top = null;
	private int max = 0;

	public void push(int n) {
		Node node = new Node(n);
		node.next = this.top;
		this.top = node;
		if (n >= this.max) {
			this.max = n;
		}
	}

	public int pop() {
		if (!isEmpty()) {
			Node del = this.top;
			this.top = del.next;
			if (this.max == del.num) {
				calculateMax();
			}
			return del.num;
		} else {
			System.out.println("Stack Empty!");
			return -1;
		}
	}
	
	public void calculateMax() {
		Node temp = top;
		int largest = 0;
		while (temp != null) {
			if(temp.num >= largest){
				largest = temp.num;
			}
			temp = temp.next;
		}
		this.max = largest;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	public int getMax() {
		return this.max;
	}
}
