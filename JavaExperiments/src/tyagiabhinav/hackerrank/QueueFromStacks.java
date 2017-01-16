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
public class QueueFromStacks {

	private static Stack<Integer> S1 = new Stack<Integer>();
	private static Stack<Integer> S2 = new Stack<Integer>();
	private static int front;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			switch (in.nextInt()) {
			case 1: // enqueue
				enqueue(in.nextInt());
				break;
			case 2: // dequeue
				dequeue();
				break;
			case 3: // print
//				print();
				System.out.println(front);
				break;
			}
		}
	}

	private static void enqueue(int n) {
		if(S2.empty()){
			// put in S1
			if(S1.empty())
				front = n;
			S1.push(n);
		}else{
			// copy from S2 to S1 and then push
			while(!S2.empty()){
				int pop = S2.pop();
				if(S1.empty())
					front = pop;
				S1.push(pop);
			}
			S1.push(n);
		}
	}

	private static void dequeue() {
		if(!S2.empty()){
			// pop S2
			S2.pop();
			if(!S2.empty())
				front = S2.peek();
		}else {
			while(!S1.empty()){
				S2.push(S1.pop());
			}
			S2.pop();
			if(!S2.empty())
				front = S2.peek();
		}
	}

//	private static void print() {
//		if(!S1.empty()){
//			Stack<Integer> S2 = new Stack<Integer>();
//			while(!S1.empty()){
//				S2.push(S1.pop());
////				System.out.println("copying into S2");
//			}
//			System.out.println("peeking.. "+S2.peek());
//			while(!S2.empty()){
//				S1.push(S2.pop());
////				System.out.println("copying back into S1");
//			}
////			System.out.println("done... S1->"+S1.size()+"  S2->"+S2.size());
//		}
//	}

}
