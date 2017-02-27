/**
 * 
 */
package lab3;

/**
 * @author Miguel
 *
 */
public interface ListInterface<T> {
	public boolean add(T newEntry);
	
	public boolean add(int location, T newEntry);
	
	public boolean remove(T newEntry);
	
	public boolean removeAll();
	
	public boolean replace(T newEntry);
	
	public boolean look();
	
	public void lookAll();
	
	public boolean search(T newEntry);
	
	public int count();
	
	public boolean isEmpty();
	
}
