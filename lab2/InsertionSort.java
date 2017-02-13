/**
 * 
 */
package lab2;

/**
 * @author Miguel Menjivar
 *
 */
public class InsertionSort
{
	public void insertionSort(int[] a, int first, int last){
		//int i = first + 1;
		for(int i = first + 1; i < last; i++){
			int nextToInsert = a[i];
			insertInOrder(nextToInsert, a, first, i - 1);
		}
		displayArray(a);
	}
	public void insertInOrder(int anEntry, int[] a, int begin, int end){
		int index = end;
		while(index >= begin && anEntry < a[index]){
			a[index + 1] = a[index];
			index--;
		}
		a[index + 1] = anEntry;
	}
	
	public void displayArray(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
	}
}
