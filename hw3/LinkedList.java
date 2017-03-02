/**
 * 
 */
package hw3;

/**
 * @author Miguel Menjivar
 *
 */
public class LinkedList<T> implements ListInterface<T> {
	private Node head;
	//private Node Tail;
	private int numberOfEntries;

	public boolean add(T newEntry) {
		Node newNode = new Node<T>(newEntry);
		
		if(isEmpty()){
			head = newNode;
		} else{
			Node lastNode = getNodeAt(numberOfEntries);
			lastNode.setNext(newEntry);
		}
		numberOfEntries++;
		return false;
	}
	public boolean add(int location, T newEntry) {
		if(location >= 1 && location <= numberOfEntries + 1){
			Node newNode = new Node(newEntry);
			
			if(location == 1){
				newNode.setNext(head);
				head = newNode;
			} else{
				Node nodeBefore = getNodeAt(location - 1);
				Node nodeAfter = nodeBefore.getNext();
				newNode.setNext(nodeAfter);
				nodeBefore.setNext(newNode);
			}
			numberOfEntries++;
		}
		return false;
	}

	public boolean remove(T newEntry) {
		
		return false;
	}

	public boolean removeAll() {
		head = null;
		numberOfEntries = 0;
		return true;
	}
	
	public boolean replace(T newEntry, int position) {
		if(position >= 1 && position <= numberOfEntries){
			Node desiredNode = getNodeAt(position);
			T originalEntry = Node.getData();
			return true;
		}
		return false;
	}

	public boolean look() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean lookAll() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean search(T newEntry) {
		Node currentNode = head;
		while(!false && (currentNode != null)){
			if(newEntry.equals(currentNode.getData())){
				return true;
			} else{
				currentNode = currentNode.getNext();
			}
		}
		return false;
	}

	public int count() {
		
		return 0;
	}

	public boolean isEmpty() {
		if(numberOfEntries == 0){
			head = null;
			return true;
		} else{
			return false;
		}
		
	}
	
	private Node getNodeAt(int position){
		if(head != null && 1<- position && position <- numberOfEntries){
			Node currentNode 
		}
		return null;
	}
	
}

class Node<T>{
	private T data;
	private Node next;
	
	public Node(T dataPortion){
		this(dataPortion, null);
	}
	
	public Node(T dataPortion, Node nextNode){
		data = dataPortion;
		next = nextNode;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
}