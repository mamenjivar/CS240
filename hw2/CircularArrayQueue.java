/**
 * 
 */
package hw2;

/**
 * @author Miguel Menjivar
 *
 */
public class CircularArrayQueue<T> implements QueueInterface<T> {
	private T[] queue;
	private int frontIndex;
	private int backIndex;
	private static final int DEFAULT_CAPACITY = 10;
	
	/**
	 * Default Constructor #1
	 */
	public CircularArrayQueue(){
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * Default Constructor #2
	 * @param initialCapacity inputed by user
	 */
	public CircularArrayQueue(int initialCapacity){
		
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[]) new Object[initialCapacity + 1];
		queue = tempQueue;
		frontIndex = 0;
		backIndex = initialCapacity;
	}

	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		backIndex = (backIndex + 1) % queue.length;
		queue[backIndex] = newEntry;
	}

	/** Removes and returns the entry at the front of this queue.
	   @return  The object at the front of the queue. 
	   @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() {
		T front = queue[frontIndex];
		queue[frontIndex] = null;
		frontIndex = (frontIndex + 1) % queue.length;
		return front;
	}

	/**  Retrieves the entry at the front of this queue.
	   @return  The object at the front of the queue.
	   @throws  EmptyQueueException if the queue is empty. */
	public T getFront() {
		return queue[frontIndex];
	}

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		if(frontIndex == (backIndex + 1) % queue.length){
			return true;
		}else
			return false;
	}

	/** Removes all entries from this queue. */
	public void clear() {
		frontIndex = 0;
		backIndex = queue.length - 1;
	}
}