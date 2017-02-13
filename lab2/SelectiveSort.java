/**
 * 
 */
package lab2;

/**
 * @author Miguel Menjivar
 *
 */
public class SelectiveSort
{
	
	/**
	 * This method will rearrange the array from least to greatest
	 * using integers in an iterative way
	 * 
	 * @param unsortedArray
	 */
	public void iterativeSort(int[] unsortedArray){
		int arrayLength = unsortedArray.length;
		int[] sortedArray = new int[arrayLength];
		
		for(int i = 0; i < arrayLength - 1; i++){
			int count = i;
			
			for(int j = i + 1; j < arrayLength; j++){
				if(unsortedArray[count] > unsortedArray[j]){
					count = j;
				}
			}
			
			int number = unsortedArray[count];
			unsortedArray[count] = unsortedArray[i];
			sortedArray[i] = number;
						
		}
		displayArray(sortedArray);
	}
	
	/**
	 * This method will rearrange the array from least to greatest
	 * using integers in a recursive way
	 * 
	 * @param unsortedArray
	 */
	public void recursionSort(int[] unsortedArray, int first, int last){
		if(first < last){
			int indexOfNextSmallest = unsortedArray[first];
			
		}
		
	}
	
	/**
	 * This method will display the already fixed array after it goes
	 * through either the iterative or the recursive method 
	 * 
	 * @param fixedArray
	 */
	public void displayArray(int[] fixedArray){
		for(int i = 0; i < fixedArray.length; i++){
			System.out.print(" " + fixedArray[i]);
		}
	}
}
