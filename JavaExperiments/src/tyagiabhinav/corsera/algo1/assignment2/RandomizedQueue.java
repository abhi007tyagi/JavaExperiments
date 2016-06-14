/**
 * 
 */
package tyagiabhinav.corsera.algo1.assignment2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author abhinavtyagi
 *
 */
public class RandomizedQueue<Item> implements Iterable<Item> {
	private Node<Item> first; // beginning of queue
	private Node<Item> last; // end of queue
	private int N; // number of elements on queue

	// helper linked list class
	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	/**
	 * Initializes an empty queue.
	 */
	public RandomizedQueue() {
		first = null;
		last = null;
		N = 0;
	}

	/**
	 * Returns true if this queue is empty.
	 *
	 * @return <tt>true</tt> if this queue is empty; <tt>false</tt> otherwise
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Returns the number of items in this queue.
	 *
	 * @return the number of items in this queue
	 */
	public int size() {
		return N;
	}

	/**
	 * Adds the item to this queue.
	 *
	 * @param item
	 *            the item to add
	 */
	public void enqueue(Item item) {
		if (item == null)
			throw new NullPointerException("Item can't be null");
		Node<Item> oldlast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
		N++;
	}

	/**
	 * Removes and returns the item on this queue that was least recently added.
	 *
	 * @return the item on this queue that was least recently added
	 * @throws NoSuchElementException
	 *             if this queue is empty
	 */
	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randPos = rand.nextInt(N);
		System.out.println("Rand->"+randPos);
		int i = 0;
		Node<Item> returnNode = null;
		Node<Item> prevNode = null;
		ListIterator listIterator = (ListIterator) this.iterator();
		while (listIterator.hasNext()) {
			if (i == randPos) {
				returnNode = listIterator.getCurrentNode();
				break;
			} else {
				prevNode = listIterator.getCurrentNode();
				i++;
			}
		}
		Item returnItem = returnNode.item;
		try {
			System.out.println("Prev-->" + prevNode.item);
			System.out.println("Current-->" + returnNode.item);
			System.out.println("ReturnKaNext-->" + returnNode.next.item);
		} catch (Exception e) {

		}
		if(returnNode == first){
			first = returnNode.next;
		}else if (prevNode != null) {
			prevNode.next = returnNode.next;
			if(returnNode == last){
				last = prevNode;
			}
		} 
		N--;
		if (isEmpty())
			last = null; // to avoid loitering
		return returnItem;
	}

	/**
	 * Returns an item on this queue that was randomly selected.
	 *
	 * @return the item on this queue that was randomly selected
	 * @throws NoSuchElementException
	 *             if this queue is empty
	 */
	public Item sample() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randPos = rand.nextInt(N);
		System.out.println("Rand->"+randPos);
		int i = 0;
		Item returnItem = null;
		for (Item item : this) {
			if (i == randPos) {
				returnItem = item;
				break;
			}else{
				i++;
			}
		}
		return returnItem;
	}

	/**
	 * Returns an iterator that iterates over the items in this queue in FIFO
	 * order.
	 *
	 * @return an iterator that iterates over the items in this queue in FIFO
	 *         order
	 */
	public Iterator<Item> iterator() {
		return new ListIterator<Item>(first);
	}

	// an iterator, doesn't implement remove() since it's optional
	private class ListIterator<Item> implements Iterator<Item> {
		private Node<Item> current;

		public ListIterator(Node<Item> first) {
			current = first;
		}

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Node<Item> getCurrentNode() {
			if (!hasNext())
				throw new NoSuchElementException();
			Node<Item> node = current;
			current = current.next;
			return node;
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>();
		rq.enqueue(1);
		printList(rq);
		rq.enqueue(2);
		printList(rq);
		rq.enqueue(3);
		printList(rq);
		rq.enqueue(4);
		printList(rq);
		rq.enqueue(5);
		printList(rq);
		rq.enqueue(6);
		printList(rq);
		rq.enqueue(7);
		printList(rq);
		System.out.println("Sample--> " + rq.sample());
		printList(rq);
		System.out.println("Sample--> " + rq.sample());
		printList(rq);
		System.out.println("Deque--> " + rq.dequeue());
		printList(rq);
		System.out.println("Deque--> " + rq.dequeue());
		printList(rq);

	}

	private static void printList(RandomizedQueue<Integer> dq) {
		for (int i : dq) {
			System.out.print(i);
		}
		System.out.println("  | Size->" + dq.size());
	}

}
