/**
 * 
 */
package hw4;

/**
 * @author User
 *
 */
public class LinkedSortedList<T extends Comparable<? super T>> implements SortedListInterface<T> {
	private Node firstNode;
	private int numberOfEntries;
	
	public LinkedSortedList(){
		firstNode = null;
		numberOfEntries = 0;
	}
	
	/** Adds a new entry to this sorted list in its proper order.
    The list's size is increased by 1.
    @param newEntry  The object to be added as a new entry. */
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
		Node nodeBefore = getNodeBefore(newEntry);
		
		if(isEmpty() || (nodeBefore == null)){
			newNode.setNextNode(firstNode);
			firstNode = newNode;
		}
		else{
			Node nodeAfter = nodeBefore.getNextNode();
			newNode.setNextNode(nodeAfter);
			nodeBefore.setNextNode(newNode);
		}
		numberOfEntries++;
	}
	
	private Node getNodeBefore(T anEntry){
		Node currentNode = firstNode;
		Node nodeBefore = null;
		
		while((currentNode != null) && (anEntry.compareTo(currentNode.getData()) > 0)){
			nodeBefore = currentNode;
			currentNode = currentNode.getNextNode();
		}
		return nodeBefore;
	}

	/** Removes the first or only occurrence of a specified entry
    from this sorted list.
    @param anEntry  The object to be removed.
    @return  True if anEntry was located and removed; 
             otherwise returns false. */
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	/** Gets the position of an entry in this sorted list.
    @param anEntry  The object to be found.
    @return  The position of the first or only occurrence of anEntry
             if it occurs in the list; otherwise returns the position
             where anEntry would occur in the list, but as a negative
             integer. */
	public int getPosition(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
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

	private Node getNodeAt(int givenPosition){
		Node currentNode = firstNode;
		for(int i = 1; i < givenPosition; i++){
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
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

	/** Replaces the entry at a given position in this list.
	   @param givenPosition  An integer that indicates the position of
	                         the entry to be replaced.
	   @param newEntry  The object that will replace the entry at the
	                    position givenPosition.
	   @return  The original entry that was replaced.
	   @throws  IndexOutOfBoundsException if either
	            givenPosition < 1 or givenPosition > getLength(). */
	public void clear() {
		firstNode = null;
		
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
