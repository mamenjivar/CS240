/**
 * 
 */
package hw3;

import java.util.Vector;

/**
 * @author Miguel
 *
 */
public class VectorList<T> implements ListInterface<T> {

	private Vector<T> list;
	private static final int DEFAULT_SIZE = 25; 
	
	public VectorList(){
		list = new Vector<T>(DEFAULT_SIZE);
	}
	
	public VectorList(int size){
		list = new Vector<T>(size);
	}
	
	public boolean add(T newEntry) {
		if(!isEmpty()){
			list.addElement(newEntry);
			return true;
		}
		return false;
	}

	public boolean add(int location, T newEntry) {
		if(!isEmpty()){
			list.add(location, newEntry);
			return true;
		}
		return false;
	}

	public boolean remove(T newEntry) {
		list.remove(newEntry);
		return false;
	}

	public boolean removeAll() {
		if(!isEmpty()){
			list.removeAllElements();
			return true;
		}
		return false;
	}

	public boolean replace(T newEntry) {
		
		return false;
	}

	@SuppressWarnings("unchecked")
	public T look() {
		Vector<T> temp = new Vector(list.size());
		temp = (Vector<T>) list.clone();
		
		return temp.get(0);
	}

	@SuppressWarnings("unchecked")
	public boolean lookAll() {
		T[] temp = (T[]) new Object[list.size()];
		temp = (T[]) list.toArray();
		
		return true;
	}

	public boolean search(T newEntry) {
		return list.contains(newEntry);
	}

	public int count() {
		return list.size();
	}

	public boolean isEmpty() {
		if(count() == 0){
			return true;
		}
		return false;
	}
}
