/**
 * 
 */
package lab2;

/**
 * @author Miguel
 *
 */
public class RadixSort
{
	public void iterativeSort(int[] a){
		int first = a[0];
		int exp = 1;
		int length = a.length;
		int[] temp2 = new int[length];
		
		for(int i = 0; i < length - 1; i++){
			if(a[i] > first){
				first = a[i];
			}
		}
		while (first / exp > 0){
			int[] temp = new int[a.length];
			
			for(int i = 0; i < length - 1; i++){
				temp[(a[i] / exp) % 10]++;
			}
			for(int i = 0; i < a.length; i++){
				temp[i] += temp[i - 1];
			}
			for(int i = length - 1; i >= 0; i--){
				temp2[--temp[(a[i]/ exp) % 10]] = a[i];
			}
			for(int i = 0; i < length; i++){
				a[i] = temp2[i];
			}
			exp *=10;
		}
	}
}
