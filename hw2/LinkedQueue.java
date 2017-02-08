/**
 * 
 */
package hw2;

/**
 * @author Miguel Menjivar
 *
 */
public class LinkedQueue<T> implements QueueInterface<T>{
	private Node firstNode;
	private Node lastNode;
	
	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty()){
			firstNode = newNode;
		} else{
			lastNode.setNext(newNode);
		}
		lastNode = newNode;
	}

	/** Removes and returns the entry at the front of this queue.
	   @return  The object at the front of the queue. 
	   @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() {
		T front = getFront();
		assert firstNode != null;
		firstNode.setData(null);;
		firstNode = firstNode.getNext();
		
		if(firstNode == null){
			lastNode = null;
		}
		return front;
	}

	/**  Retrieves the entry at the front of this queue.
	   @return  The object at the front of the queue.
	   @throws  EmptyQueueException if the queue is empty. */
	public T getFront() {
		
		return firstNode.getData();
	}

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		if(firstNode == null && lastNode == null)
			return true;
		else
			return false;
	}

	/** Removes all entries from this queue. */
	public void clear() {
		firstNode = null;
		lastNode = null;
		
	}
	
	/** */
	private class Node{
		private T data;
		private Node next;
		
		private Node(T node){
			this(node, null);
		}
		
		private Node(T node, Node nextNode){
			this.data = node;
			this.next = nextNode;
		}
		
		private void setData(T data){
			this.data = data;
		}
		
		private T getData(){
			return data;
		}
		
		private void setNext(Node next){
			this.next = next;
		}
		
		private Node getNext(){
			return next;
		}
	}
}