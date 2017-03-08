/**
 * 
 */
package hw4;

/**
 * @author User
 *
 */
public class ArrayList<T> implements ListInterface<T> {
	private T[] list;
	private int numberOfEntries;
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 100;
	
	/**Default constructor*/
	public ArrayList(){
		this(DEFAULT_CAPACITY);
	}
	/**Default Constructor*/
	public ArrayList(int initialCapacity){
		if(initialCapacity < DEFAULT_CAPACITY){
			initialCapacity = DEFAULT_CAPACITY;
		}
		
		@SuppressWarnings("unchecked")
		T[] tempList = (T[])new Object[initialCapacity + 1];
		list = tempList;
		numberOfEntries = 0;
		initialized = true;
	}
	
	/** Adds a new entry to the end of this list.
	   Entries currently in the list are unaffected.
	   The list's size is increased by 1.
	   @param newEntry  The object to be added as a new entry. */
	public void add(T newEntry) {
		list[numberOfEntries++] = newEntry;
		numberOfEntries++;
	}

	/** Adds a new entry at a specified position within this list.
	   Entries originally at and above the specified position
	   are at the next higher position within the list.
	   The list's size is increased by 1.
	   @param newPosition  An integer that specifies the desired
	                       position of the new entry.
	   @param newEntry     The object to be added as a new entry.
	   @throws  IndexOutOfBoundsException if either
	            newPosition < 1 or newPosition > getLength() + 1. */
	public void add(int newPosition, T newEntry) {
		if((newPosition >= 1) &&(newPosition <= numberOfEntries + 1)){
			if(newPosition <= numberOfEntries){
				//makeRoom(newPosition);
			}
			list[newPosition] = newEntry;
			numberOfEntries++;
		}
		else
			//throw new IndexOutOfBoundsExcepetion()"Given position out of bounds");
	}

	/** Removes the entry at a given position from this list.
	   Entries originally at positions higher than the given
	   position are at the next lower position within the list,
	   and the list's size is decreased by 1.
	   @param givenPosition  An integer that indicates the position of
	                         the entry to be removed.
	   @return  A reference to the removed entry.
	   @throws  IndexOutOfBoundsException if either 
	            givenPosition < 1 or givenPosition > getLength(). */
	public T remove(int givenPosition) {
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
			T result = list[givenPosition];
			if(givenPosition< numberOfEntries){
				//removeGap(givenPosition;
			}
			numberOfEntries--;
			return result;
		}
		return null;
	}

	/** Removes all entries from this list. */
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	/** Replaces the entry at a given position in this list.
	   @param givenPosition  An integer that indicates the position of
	                         the entry to be replaced.
	   @param newEntry  The object that will replace the entry at the
	                    position givenPosition.
	   @return  The original entry that was replaced.
	   @throws  IndexOutOfBoundsException if either
	            givenPosition < 1 or givenPosition > getLength(). */
	public T replace(int givenPosition, T newEntry) {
		if((givenPosition >= 1) &&( givenPosition <= numberOfEntries)){
			T originalEntry = list[givenPosition];
			list[givenPosition] = newEntry;
			return originalEntry;
		}
		//return originalEntry;
		return null;
	}

	/** Retrieves the entry at a given position in this list.
	   @param givenPosition  An integer that indicates the position of
	                         the desired entry.
	   @return  A reference to the indicated entry.
	   @throws  IndexOutOfBoundsException if either
	            givenPosition < 1 or givenPosition > getLength(). */
	public T getEntry(int givenPosition) {
		if((givenPosition >= 1) && (givenPosition<= numberOfEntries)){
			return list[givenPosition];
		}
		return null;
	}

	/** Retrieves all entries that are in this list in the order in which
	   they occur in the list.
	   @return  A newly allocated array of all the entries in the list.
	            If the list is empty, the returned array is empty. */
	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numberOfEntries];
		for( int index = 0; index < numberOfEntries; index++){
			result[index] = list[index + 1];
 		}
		return result;
	}

	/** Sees whether this list contains a given entry.
	   @param anEntry  The object that is the desired entry.
	   @return  True if the list contains anEntry, or false if not. */
	public boolean contains(T anEntry) {
		boolean found = false;
		int index = 1;
		while(!found && (index<= numberOfEntries)){
			if(anEntry.equals(list[index])){
				found = true;
			}
			index++;
		}
		return found;
	}

	/** Gets the length of this list.
	   @return  The integer number of entries currently in the list. */
	public int getLength() {
		return numberOfEntries;
	}

	/** Sees whether this list is empty.
	   @return  True if the list is empty, or false if not. */
	public boolean isEmpty() {	
		return numberOfEntries == 0;
	}

}