/**
 * 
 */
package lab3;

import java.util.Random;

/**
 * @author Miguel Menjivar
 *
 */

public class FoodStack<T> {
	VectorStack<Integer> bun; 
	VectorStack<Integer> patty; 
	VectorStack<Integer> lettuce; 
	VectorStack<Integer> tomato;
	VectorStack<Integer> onion; 
	VectorStack<Integer> cheese;
	
	private int item1 = 0;
	private int item2 = 0;
	private int item3 = 0;
	private int item4 = 0;
	private int item5 = 0;
	private int item6 = 0;
	
	public FoodStack(){
		bun = new VectorStack<>();
		patty = new VectorStack<>();
		lettuce = new VectorStack<>();
		tomato = new VectorStack<>();
		onion = new VectorStack<>();
		cheese = new VectorStack<>();
	}

	/**
	 * simulation when the delivery arrives
	 */
	public void reloadInventory(){
		Random rand = new Random();
		Random inventory = new Random();
		
		for(int i = 0; i < inventory.nextInt(500) + 100; i++){
			int delivery = rand.nextInt(6) + 1; 
			
			if(delivery == 1){
				bun.push(delivery);
			}
			
			else if(delivery == 2){
				patty.push(delivery);
			}
			
			else if(delivery == 3){
				lettuce.push(delivery);
			}
			
			else if(delivery == 4){
				tomato.push(delivery);
			}
			
			else if(delivery == 5){
				onion.push(delivery);
			}
			
			else if(delivery == 6){
				cheese.push(delivery);
			}
			
			else{
				System.out.println("This does not belong");
			}
		}
	}
	
	/**
	 * Will check how much food items are currently in the inventory
	 */
	public void checkInventory(){
		
		item1 = bun.size();
		item2 = patty.size();
		item3 = lettuce.size();
		item4 = tomato.size();
		item5 = onion.size();
		item6 = cheese.size();

	}
	
	public void orderedFood(){
		
	}

	/**
	 * setters and getters for the number of items available for each meal
	 * @return
	 */
	public int getItemOne(){
		return item1;
	}
	
	public void setItemOne(int item1){
		this.item1 = item1;
	}
	
	public int getItemTwo(){
		return item2;
	}
	
	public void setItemTwo(int item2){
		this.item2 = item2;
	}
	
	public int getItemThree(){
		return item3;
	}
	
	public void setItemThree(int item3){
		this.item3 = item3;
	}
	
	public int getItemFour(){
		return item4;
	}
	
	public void setItemFour(int item4){
		this.item4 = item4;
	}
	
	public int getItemFive(){
		return item5;
	}
	
	public void setItemFive(int item5){
		this.item5 = item5;
	}
	
	public int getItemSix(){
		return item6;
	}
	
	public void setItemSix(int item6){
		this.item6 = item6;
	}
}