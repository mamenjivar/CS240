/**
 * 
 */
package lab3;

import java.util.Vector;

/**
 * @author Miguel Menjivar
 *
 */
public class VectorList<T> implements ListInterface<T> {

	private Vector<T> list;
	private static final int DEFAULT_SIZE = 100; 
	
	public VectorList(){
		list = new Vector<>(DEFAULT_SIZE);
	}
	
	public VectorList(int size){
		list = new Vector<>(size);
	}
	
	public boolean add(T newEntry) {
//		if(isEmpty()){
//			list.addElement(newEntry);
//			return true;
//		}
//		return false;
		list.add(newEntry);
		return true;
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
	public boolean look() {
		Vector<T> temp = new Vector(list.size());
		temp = (Vector<T>) list.clone();
		temp.get(0);
		
		return true;
	}

	@SuppressWarnings("unchecked")
	public void lookAll() {
		Vector<String> temp = new Vector<>(list.size());
//		for(int i = 0; i < list.size(); i++){
//			//temp.add(list.get(i));
//		}
//		System.out.print(" " + temp.toString());
		for (int i = 0; i < list.size(); i++){
			T o = list.get(i);
			System.out.println(" " + o);
		}
		  list.toArray();
	//	temp = (Vector<String>) list.clone();
		//System.out.print(" " + list.toString());
		
		//return true;
	}

	public boolean search(T newEntry) {
		return list.contains(newEntry);
	}

	public int count() {
		return list.size();
	}

	public boolean isEmpty() {
		if(list.isEmpty()){
			return true;
		}
		return false;
	}
}