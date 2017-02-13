/**
 * 
 */
package lab2;

/**
 * @author Miguel
 *
 */
public class ShellSort
{
	public void iterativeSort(int[] a){
		int inside;
		int outside;
		int pointer;
		int length = a.length;
		
		int h = 1;
		while(h <= length / 3){
			h = (h * 3) + 1;
		}
		while (h > 0){
			for(outside = h; outside < length; outside++){
				pointer = a[outside];
				inside = outside;
				
				while (inside > h - 1 && a[inside - h] >= pointer){
					a[inside] = a[inside - h];
					inside -= h;
				}
				a[inside] = pointer;
			}
			h = (h - 1) / 3;
		}
		displayArray(a);
		
	}

	public void displayArray(int[] a)
	{
		for(int i = 0; i < a.length; i++){
			System.out.print(" " + a[i]);
		}
		
	}
}
