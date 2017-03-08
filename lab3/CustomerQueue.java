/**
 * 
 */
package lab3;

import java.util.Random;

/**
 * @author Miguel Menjivar
 *
 */
public class CustomerQueue<T> {
	
	//create vector queue
	CircularArrayQueue<Integer> caQ = new CircularArrayQueue<>();
	Random orders = new Random();
	Random customers = new Random();
	
	private int itemOne = 0;
	private int itemTwo = 0;
	private int itemThree = 0;
	private int itemFour = 0;
	private int itemFive = 0;
	private int itemSix = 0;
	
	/**
	 * Will simulate how many people are getting in line to order food
	 */
	public void customerLine(){
		for(int i = 0; i < customers.nextInt(100) + 50; i++){
			caQ.enqueue(i);
		}
		
		int counts = 0;
		while(!caQ.isEmpty()){
			counts++;
			caQ.dequeue();
			
			int choices = orders.nextInt(6) + 1;
			if(choices == 1){
				countItemOne();
			}
			else if(choices == 2){
				countItemTwo();
			}
			else if(choices == 3){
				countItemThree();
			}
			else if(choices == 4){
				countItemFour();
			}
			else if(choices == 5){
				countItemFive();
			}
			else if(choices == 6){
				countItemSix();
			}
		}
	}

	/**
	 * Will increment one to every order each customer makes throughout the day
	 */
	public void countItemOne(){
		itemOne++;
	}
	
	public void countItemTwo(){
		itemTwo++;
	}
	
	public void countItemThree(){
		itemThree++;
	}
	
	public void countItemFour(){
		itemFour++;
	}
	
	public void countItemFive(){
		itemFive++;
	}
	
	public void countItemSix(){
		itemSix++;
	}

	/**
	 * @return the itemOne
	 */
	public int getItemOne() {
		return itemOne;
	}

	/**
	 * @param itemOne the itemOne to set
	 */
	public void setItemOne(int itemOne) {
		this.itemOne = itemOne;
	}

	/**
	 * @return the itemTwo
	 */
	public int getItemTwo() {
		return itemTwo;
	}

	/**
	 * @param itemTwo the itemTwo to set
	 */
	public void setItemTwo(int itemTwo) {
		this.itemTwo = itemTwo;
	}

	/**
	 * @return the itemThree
	 */
	public int getItemThree() {
		return itemThree;
	}

	/**
	 * @param itemThree the itemThree to set
	 */
	public void setItemThree(int itemThree) {
		this.itemThree = itemThree;
	}

	/**
	 * @return the itemFour
	 */
	public int getItemFour() {
		return itemFour;
	}

	/**
	 * @param itemFour the itemFour to set
	 */
	public void setItemFour(int itemFour) {
		this.itemFour = itemFour;
	}

	/**
	 * @return the itemFive
	 */
	public int getItemFive() {
		return itemFive;
	}

	/**
	 * @param itemFive the itemFive to set
	 */
	public void setItemFive(int itemFive) {
		this.itemFive = itemFive;
	}

	/**
	 * @return the itemSix
	 */
	public int getItemSix() {
		return itemSix;
	}

	/**
	 * @param itemSix the itemSix to set
	 */
	public void setItemSix(int itemSix) {
		this.itemSix = itemSix;
	}

}
