/**
 * 
 */
package hw2;

/**
 * @author Miguel Menjivar
 *
 */
public class CircularLinkedQueue<T> implements QueueInterface<T> {
	private Node queueNode;
	private Node freeNode;
	
	/** Default Constructor */
	public CircularLinkedQueue(){
		freeNode = new Node(null, null);
		freeNode.setNext(freeNode);
		queueNode = freeNode;
	}
	
	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		if(isChainFull()){
			freeNode.setData(newEntry);
			Node newNode = new Node(null, freeNode.getNext());
			freeNode.setNext(newNode);
		} else
			freeNode = freeNode.getNext();
	}

	/** Removes and returns the entry at the front of this queue.
	   @return  The object at the front of the queue. 
	   @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() {
		T front = getFront();
		assert !isEmpty();
		queueNode.setData(null);
		queueNode = queueNode.getNext();
		
		return front;
	}

	/**  Retrieves the entry at the front of this queue.
	   @return  The object at the front of the queue.
	   @throws  EmptyQueueException if the queue is empty. */
	public T getFront() {
		return queueNode.getData();
	}

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		return queueNode == freeNode;
	}
	
	/** Detects whether the linked nodes are full*/
	public boolean isChainFull(){
		return queueNode == freeNode.getNext();
	}

	/** Removes all entries from this queue. */
	public void clear() {
		freeNode = null;
	}
	
	/**
	 * Node class that pushes data for queue */
	private class Node{
		private T data;
		private Node next;
		
		/** private constructor #1
			@param node */
		private Node(T node){
			this(node, null);
		}
		
		/** private constructor #2*/
		private Node(T node, Node nextNode){
			this.data = node;
			this.next = nextNode;
		}
		
		/** setter for field data */
		private void setData(T data){
			this.data = data;
		}
		
		/** getter for field data */
		private T getData(){
			return data;
		}
		
		/** setter for field Node next */
		private void setNext(Node next){
			this.next = next;
		}
		
		/** getter for field Node next */
		private Node getNext(){
			return next;
		}
	}
}