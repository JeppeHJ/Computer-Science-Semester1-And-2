package Opgaver.Opg1_Array_Queue;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {
	private int head;
	private int tail;
	private Object[] queue;
	private final int INITIAL_SIZE = 10;
	private int size;

	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		queue = new Object[INITIAL_SIZE];
		head = -1;
		tail = -1;
		size = 0;
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		growIfNecessary();
		if (size == 0) {
			queue[0] = newElement;
			tail++;
			head++;
			size++;
		} else {
			tail++;
			queue[tail] = newElement;
			size++;
		}
	}

	private void growIfNecessary() {
		if (size + 1 == queue.length) {
			Object[] newElements = new Object[queue.length * 2];
			for (int i = 0; i < queue.length; i++) {
				newElements[i] = queue[i];
			}
			queue = newElements;
		}
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		if (size == 0) {
			return null;
		}
		Object toBeRemoved = queue[head];
		for (int i = 0; i < tail; i++) {
			queue[i] = queue[i + 1];
		}
		tail--;
		size--;
		if (size == 0) {
			head = -1;
			tail = -1;
		}

		return toBeRemoved;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		if (!(head == -1)) {
			return queue[head];
		}
		return null;
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return size;
	}
}
