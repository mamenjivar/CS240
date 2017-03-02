/**
 * 
 */
package hw3;

/**
 * @author Miguel Menjivar
 *
 */
public class DLDeque<T> implements DequeInterface<T> {
	private DLNode firstNode;
	private DLNode lastNode;
	
	public DLDeque(){
		firstNode = null;
		lastNode = null;
	}

	/** Adds a new entry to the front/back of this dequeue.
    @param newEntry  An object to be added. */
	public void addToFront(T newEntry) {
		DLNode newNode = new DLNode(null, newEntry, firstNode);
		if(isEmpty()){
			lastNode = newNode;
		} else{
			firstNode.setPrevious(newNode);
		}
		firstNode = newNode;
	}

	   /** Removes and returns the front/back entry of this dequeue.
    @return  The object at the front/back of the dequeue.
    @throws  EmptyQueueException if the dequeue is empty before the operation. */
	public void addToBack(T newEntry) {
		DLNode newNode = new DLNode(lastNode, newEntry, null);
		if(isEmpty()){
			firstNode = newNode;
		} else{
			lastNode.setNext(newNode);
		}
		lastNode = newNode;
	}

	   /** Removes and returns the front/back entry of this dequeue.
    @return  The object at the front/back of the dequeue.
    @throws  EmptyQueueException if the dequeue is empty before the operation. */
	public T removeFront() {
		T front = getFront();
		firstNode = firstNode.getPrevious();
		
		if(firstNode == null){
			firstNode = null;
		} else{
			firstNode.setNext(null);
		}
		return front;
	}

	 /** Removes and returns the front/back entry of this dequeue.
    @return  The object at the front/back of the dequeue.
    @throws  EmptyQueueException if the dequeue is empty before the operation. */
	public T removeBack() {
		T back = getBack();
		lastNode = lastNode.getPrevious();
		
		if(lastNode == null){
			firstNode = null;
		} else{
			lastNode.setNext(null);
		}
		return back;
	}

	 /** Retrieves the front/back entry of this dequeue.
    @return  The object at the front/back of the dequeue.
    @throws  EmptyQueueException if the dequeue is empty before the operation. */
	public T getFront() {
		
		return firstNode.getData();
	}

	 /** Retrieves the front/back entry of this dequeue.
    @return  The object at the front/back of the dequeue.
    @throws  EmptyQueueException if the dequeue is empty before the operation. */
	public T getBack() {
		
		return lastNode.getData();
	}

	 /*  Detects whether this dequeue is empty.
    @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		if(firstNode == null){
			return true;
		}
		return false;
	}

	/*  Removes all entries from this dequeue. */
	public void clear() {
		while(!isEmpty()){
			firstNode = null;
			lastNode = null;
		}
	}
	
	private class DLNode{
		private T data;
		private DLNode next;
		private DLNode previous;
		/** default constructor */
		public DLNode(Object object, T newEntry, DLDeque<T>.DLNode firstNode) {
			
		}
		
		/** setters and getters for T data, DLNode next and previous*/
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public DLNode getNext() {
			return next;
		}
		public void setNext(DLNode next) {
			this.next = next;
		}
		public DLNode getPrevious() {
			return previous;
		}
		public void setPrevious(DLNode previous) {
			this.previous = previous;
		}	
	}
}