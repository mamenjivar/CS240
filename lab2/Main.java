/**
 * 
 */
package lab2;

/**
 * @author Miguel
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] unsortedNumbers = {3, 1, 7, 4, 5, 8, 2};
		
		displayUnsortedArray(unsortedNumbers);
		
		selectionSort(unsortedNumbers);
		
		insertionSort(unsortedNumbers);
		
		shellSort(unsortedNumbers);
		
		radixSort(unsortedNumbers);
		
		
	}
	
	/**
	 * This method will use selection sort using iteration and recursion
	 * @param a
	 */
	public static void selectionSort(int[] a){
		System.out.print("\nSelection sort: ");
		SelectiveSort ss = new SelectiveSort();
		ss.iterativeSort(a);
	}
	
	public static void insertionSort(int[] a){
		System.out.print("\nInsertion sort: ");
		InsertionSort is = new InsertionSort();
		is.insertionSort(a, 0, a.length);
	}
	
	public static void shellSort(int[] a){
		System.out.print("\nShell sort: ");
		ShellSort ss = new ShellSort();
		ss.iterativeSort(a);
	}
	
	public static void radixSort(int[] a){
		System.out.print("\nRadixSort: ");
		RadixSort rs = new RadixSort();
		rs.iterativeSort(a);
	}
	
	public static void displayUnsortedArray(int[] a){
		System.out.print("Unsorted array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
	}
}