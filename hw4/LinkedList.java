/**
 * 
 */
package hw4;

/**
 * @author Miguel
 *
 */
public class LinkedList<T> implements ListInterface<T> {
	private Node firstNode;
	private int numberOfEntries;
	
	/** Adds a new entry to the end of this list.
	   Entries currently in the list are unaffected.
	   The list's size is increased by 1.
	   @param newEntry  The object to be added as a new entry. */
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
		if(isEmpty()){
			firstNode = newNode;
		}
		else{
			Node lastNode = getNodeAt(numberOfEntries);
			lastNode.setNextNode(newNode);
		}
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
		if((newPosition >= 1) && (newPosition <= numberOfEntries + 1)){
			Node newNode = new Node(newEntry);
			if(newPosition == 1){
				newNode.setNextNode(firstNode);
				firstNode = newNode;
			}
			else{
				Node nodeBefore = getNodeAt(newPosition - 1);
				Node nodeAfter = nodeBefore.getNextNode();
				newNode.setNextNode(nodeAfter);;
				nodeBefore.setNextNode(newNode);
			}
			numberOfEntries++;
		}
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
		T result = null;
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
			if(givenPosition == 1){
				result = firstNode.getData();
				firstNode = firstNode.getNextNode();
			}
			else{
				Node nodeBefore = getNodeAt(givenPosition - 1);
				Node nodeToRemove = nodeBefore.getNextNode();
				result = nodeToRemove.getData();
				Node nodeAfter = nodeToRemove.getNextNode();
				nodeBefore.setNextNode(nodeAfter);
			}
			numberOfEntries--;
			return result;
		}
		return null;
	}

	/** Removes all entries from this list. */
	public void clear() {
		firstNode = null;
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
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
			Node desiredNode = getNodeAt(givenPosition);
			T originalEntry = desiredNode.getData();
			desiredNode.setData(newEntry);
			return originalEntry;
		}
		return null;
	}

	/** Retrieves the entry at a given position in this list.
	   @param givenPosition  An integer that indicates the position of
	                         the desired entry.
	   @return  A reference to the indicated entry.
	   @throws  IndexOutOfBoundsException if either
	            givenPosition < 1 or givenPosition > getLength(). */
	public T getEntry(int givenPosition) {
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
			return getNodeAt(givenPosition).getData();
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
		int index = 0;
		Node currentNode = firstNode;
		while((index < numberOfEntries) && (currentNode != null)){
			result[index] = currentNode.getData();
			currentNode = currentNode.getNextNode();
			index++;
		}
		return result;
	}

	/** Sees whether this list contains a given entry.
	   @param anEntry  The object that is the desired entry.
	   @return  True if the list contains anEntry, or false if not. */
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;
		while(!found && (currentNode != null)){
			if(anEntry.equals(currentNode.getData())){
				found = true;
			}
			else{
				currentNode = currentNode.getNextNode();
			}
			//return found;
		}
		return found;
	}

	/** Gets the length of this list.
	   @return  The integer number of entries currently in the list. */
	public int getLength() {
		Node temp = firstNode;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	/** Sees whether this list is empty.
	   @return  True if the list is empty, or false if not. */
	public boolean isEmpty() {
		boolean result;
		if(numberOfEntries == 0){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}
	/**Finds specific node at given position and returns the value*/
	private Node getNodeAt(int givenPosition){
		Node currentNode = firstNode;
		for(int i = 1; i < givenPosition; i++){
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}
	/**Node class for linked list*/
	private class Node{
		private T data;
		private Node next;
		
		private Node(T dataPortion){
			this(dataPortion, null);
		}
		
		private Node(T dataPortion, Node nextNode){
			data = dataPortion;
			next = nextNode;
		}
		
		private T getData(){
			return data;
		}
		
		private void setData(T newData){
			data = newData;
		}
		
		private Node getNextNode(){
			return next;
		}
		
		private void setNextNode(Node nextNode){
			next = nextNode;
		}
	}
}