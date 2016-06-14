/**
 * 
 */
package tyagiabhinav.corsera.algo1.assignment2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.Queue;

/**
 * @author abhinavtyagi
 *
 */
public class Deque<Item> implements Iterable<Item> {
	private Node<Item> first; // beginning of queue
	private Node<Item> last; // end of queue
	private int N; // number of elements on queue

	// helper linked list class
	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
		private Node<Item> prev;
	}

	/**
	 * Initializes an empty queue.
	 */
	public Deque() {
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
		return first == null || last == null;
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
	 * Adds the item to front of the queue.
	 *
	 * @param item
	 *            the item to add
	 */
	public void addLast(Item item) {
		if (item == null)
			throw new NullPointerException("Item can't be null");
		Node<Item> oldlast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
			first.prev = null;
			last.prev = null;
		} else {
			oldlast.next = last;
			last.prev = oldlast;
		}
		N++;
	}

	/**
	 * Adds the item to last of the queue.
	 *
	 * @param item
	 *            the item to add
	 */
	public void addFirst(Item item) {
		if (item == null)
			throw new NullPointerException("Item can't be null");
		Node<Item> oldfirst = first;
		first = new Node<Item>();
		first.item = item;
		first.prev = null;
		if (isEmpty()) {
			last = first;
			last.next = null;
			first.next = null;
		} else {
			oldfirst.prev = first;
			first.next = oldfirst;
		}
		N++;
	}

	/**
	 * Removes and returns the item on this queue that was first on the queue.
	 *
	 * @return the item on this queue that was first on the queue
	 * @throws NoSuchElementException
	 *             if this queue is empty
	 */
	public Item removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Item item = first.item;
		first = first.next;
		first.prev = null;
		N--;
		if (isEmpty())
			last = null; // to avoid loitering
		return item;
	}

	/**
	 * Removes and returns the item on this queue that was last on the queue.
	 *
	 * @return the item on this queue that was last on the queue
	 * @throws NoSuchElementException
	 *             if this queue is empty
	 */
	public Item removeLast() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Item item = last.item;
		last = last.prev;
		last.next = null;
		N--;
		if (isEmpty())
			first = null; // to avoid loitering
		return item;
	}

	/**
     * Returns an iterator that iterates over the items in this queue in FIFO order.
     *
     * @return an iterator that iterates over the items in this queue in FIFO order
     */
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    }
    
 // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<Integer> dq = new Deque<Integer>();
		dq.addFirst(1);
		printList(dq);
		dq.addFirst(2);
		printList(dq);
		dq.addFirst(3);
		printList(dq);
		dq.addLast(0);
		printList(dq);
		dq.removeFirst();
		printList(dq);
		dq.removeLast();
		printList(dq);
		dq.addLast(8);
		printList(dq);
		dq.addFirst(9);
		printList(dq);
		
	}
	
	private static void printList(Deque<Integer> dq){
		for(int i : dq){
			System.out.print(i);
		}
		System.out.println("  | Size->"+dq.size());
	}

}
