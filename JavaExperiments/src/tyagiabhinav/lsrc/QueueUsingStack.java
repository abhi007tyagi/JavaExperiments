/**
 * 
 */
package tyagiabhinav.lsrc;

/**
 * @author abhinavtyagi
 *
 */
public class QueueUsingStack {

	private static Stack S1, S2;

	QueueUsingStack(int s) {
		S1 = new Stack(s / 2);
		S2 = new Stack(s / 2);
	}

	public static void enqueue(int n) {
		if (S1.isFull() && S2.isFull()) {
			System.out.println("Queue is full !!");
		} else {
			S1.push(n);
		}
	}

	public static int dequeue() {
		if (S1.isEmpty() && S2.isEmpty()) {
			System.out.println("Queue is empty !!");
		} else {
			if (S2.isEmpty()) {
				while (!S1.isEmpty()) {
					S2.push(S1.pop());
				}
			}
			return S2.pop();
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueUsingStack qus = new QueueUsingStack(10);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(1);
		qus.enqueue(2);
		qus.enqueue(3);
		qus.enqueue(4);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(5);
		qus.enqueue(6);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(7);
		qus.enqueue(8);
		qus.enqueue(9);
		qus.enqueue(10);
		qus.enqueue(11);
		qus.enqueue(12);
		qus.enqueue(13);
		qus.enqueue(14);
		qus.enqueue(15);
		qus.enqueue(16);
		qus.enqueue(17);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(18);

	}

}
