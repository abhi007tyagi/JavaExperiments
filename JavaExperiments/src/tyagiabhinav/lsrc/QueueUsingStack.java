/**
 * 
 */
package tyagiabhinav.lsrc;

/**
 * @author abhinavtyagi
 *
 */
public class QueueUsingStack {

	private static Stack S;

	QueueUsingStack(int s) {
		S = new Stack(s);
	}

	public static void enqueue(int n) {
		if (S.isFull()) {
			System.out.println("Queue is full !!");
		} else {
			S.push(n);
		}
	}

	public static int dequeue() {
		int temp, p;
		if (S.isEmpty()) {
			System.out.println("Queue is empty !!");
		} else if (S.getStackFilledSize() == 1) {
			return S.pop();
		} else {
			temp = S.pop();
			p = dequeue();
			S.push(temp);
			return p;
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueUsingStack qus = new QueueUsingStack(10);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(100);
		qus.enqueue(200);
		qus.enqueue(300);
		qus.enqueue(400);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(500);
		qus.enqueue(600);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(700);
		qus.enqueue(800);
		qus.enqueue(900);
		qus.enqueue(1000);
		qus.enqueue(1100);
		qus.enqueue(1200);
		qus.enqueue(1300);
		qus.enqueue(1400);
		qus.enqueue(1500);
		qus.enqueue(1600);
		qus.enqueue(1700);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		qus.enqueue(1800);
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");
		System.out.print("DQ---->>>>>>>" + qus.dequeue() + "\n");

	}

}
