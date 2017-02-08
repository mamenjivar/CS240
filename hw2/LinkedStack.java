/**
 * 
 */
package hw2;


/**
 * @author Miguel Menjivar
 *
 */
public class LinkedStack<T> implements StackInterface<T> {
	private Node topNode;
	
	public LinkedStack(){
		topNode = null;
	}

	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;		
	}

	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. */
	public T pop() {
		T top = peek();
		assert topNode != null;
		topNode = topNode.getNext();
		
		return top;
	}

	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.*/
	public T peek() {
		return topNode.getData();
	}

	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() {
		if(topNode == null)
			return true;
		else
			return false;
	}

	/** Removes all entries from this stack. */
	public void clear() {
		topNode = null;
	}
	
	/** class that pushes information for the stack*/
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