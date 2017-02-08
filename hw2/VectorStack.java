/**
 * 
 */
package hw2;

import java.util.Vector;

/**
 * @author Miguel Menjivar
 *
 */
public class VectorStack<T> implements StackInterface<T> {
	private Vector<T> stack;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 50;
	
	/** Default constructor #1 */
	public VectorStack(){
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * Default Constructor #2
	 * @param size
	 */
	public VectorStack(int size){
		stack = new Vector<T>(size);
	}

	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		stack.add(newEntry);
	}

	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() {
		int length = stack.size();
		
		return stack.remove(length - 1);
	}

	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
	public T peek() {
		int length = stack.size();
		
		return stack.get(length - 1);
	}

	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() {
		
		return stack.isEmpty();
	}

	/** Removes all entries from this stack. */
	public void clear() {
		stack.clear();		
	}
}