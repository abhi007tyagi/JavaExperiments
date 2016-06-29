/**
 * 
 */
package tyagiabhinav.clrs;

/**
 * @author abhinavtyagi
 *
 */
public class StackUsingQueue {

	private Queue Q1, Q2;
	private boolean isSwitched = false;

	public StackUsingQueue(int s) {
		Q1 = new Queue(s);
		Q2 = new Queue(s);
	}

	public void push(int n) {
		if (!isSwitched) {
			if (!Q1.isFull()) {
				Q1.enqueue(n);
			} else {
				System.out.println("Stack Full !!");
			}
		} else {
			if (!Q2.isFull()) {
				Q2.enqueue(n);
			} else {
				System.out.println("Stack Full !!");
			}
		}
	}

	public int pop() {
		if (!Q1.isEmpty()) {
			int p = getDQ(Q1, Q2);
			isSwitched = true;
			return p;
		} else if (!Q2.isEmpty()) {
			int p = getDQ(Q2, Q1);
			isSwitched = false;
			return p;
		} else {
			System.out.println("Stack Empty !!");
		}
		return -1;
	}

	private int getDQ(Queue a, Queue b) {
		while (a.getFilledSize() > 1) {
			b.enqueue(a.dequeue());
			// isSwitched = !isSwitched;
		}
		return a.dequeue();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackUsingQueue S = new StackUsingQueue(10);
		System.out.println("Pop->" + S.pop());
		S.push(1);
		S.push(2);
		S.push(3);
		S.push(4);
		S.push(5);
		S.push(6);
		S.push(7);
		S.push(8);
		S.push(9);
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		S.push(10);
		S.push(11);
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		S.push(12);
		S.push(13);
		S.push(14);
		S.push(15);
		S.push(16);
		System.out.println("Pop->" + S.pop());
		S.push(17);
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
		System.out.println("Pop->" + S.pop());
	}

}
