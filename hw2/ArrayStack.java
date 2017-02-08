/**
 * 
 */
package hw2;

/**
 * @author Miguel Menjivar
 *
 */
public class ArrayStack<T> implements StackInterface<T>{
	
	private T[] stack;
	private int topIndex;
	private static final int MAX_CAPACITY = 10;
	private int initialCapacity;
	
	/**
	 * Default constructor #1
	 */
	public ArrayStack(){
		this(MAX_CAPACITY);
		
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[])new Object[MAX_CAPACITY];
		stack = tempStack;
		topIndex = -1;
	}
	
	/**
	 Constructor #2
	 @param initialCapacity The initial capacity set by user */
	public ArrayStack(int initialCapacity){
		this.initialCapacity = initialCapacity;
		
	}

	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		stack[topIndex + 1] = newEntry;
		topIndex++;		
	}

	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. */
	public T pop() {
		if(isEmpty()){
			System.out.println("The stack is empty");
		} else{
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}
		return null;
	}

	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.*/
	public T peek() {
		return stack[topIndex];
	}
	
	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() {
		if(topIndex < 0){
			return true;
		} else
			return false;
	}

	/** Removes all entries from this stack. */
	public void clear() {
		while(!isEmpty()){
			stack[topIndex] = null;
			topIndex--;
		}
	}
}