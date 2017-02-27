/**
 * 
 */
package lab3;

/**
 * @author Miguel Menjivar
 *
 */
public class GameEngine {

	FoodStack<Integer> fs; 
	MenuList<String> mL;
	CustomerQueue<Integer> cQ;  
	
	/**
	 * The integers used to count how many times customers ordered from the menu
	 */
	private int itemOne = 0;
	private int itemTwo = 0;
	private int itemThree = 0;
	private int itemFour = 0;
	private int itemFive = 0;
	private int itemSix = 0;
	
	/**
	 * the integers used for the amount of specific food items are available for use
	 */
	private int foodOne = 0;
	private int foodTwo = 0;
	private int foodThree = 0;
	private int foodFour = 0;
	private int foodFive = 0;
	private int foodSix = 0;
	
	/**
	 * default constructor
	 */
	public GameEngine(){
		fs = new FoodStack<>();
		mL = new MenuList<>();
		cQ = new CustomerQueue<>();
	}
	
	/**
	 * when the delivery truck arrives and restocks all the food
	 */
	public void reloadFood(){
		fs.reloadInventory();
	}
	
	/**
	 * checks the amount of food in total 
	 */
	public void checkFood(){
		fs.checkInventory();
		
		foodOne = fs.getItemOne();
		foodTwo = fs.getItemTwo();
		foodThree = fs.getItemThree();
		foodFour = fs.getItemFour();
		foodFive = fs.getItemFive();
		foodSix = fs.getItemSix();
	}
	
	/**
	 * menu class that checks the amount of items in each menu
	 */
	public void checkMenu(){
		mL.burgerItems();
		mL.burgerNoOnionItems();
		mL.cheeseBurgerItems();
		mL.veganLettuceWrapBurgerItems();
		mL.cheeseBurgerNoOnionItems();
		mL.burgerNoTomatoItems();
		//mL.viewListOne();
	}
	
	/**
	 * simulates the line as people go order
	 */
	public void checkCustomers(){
		cQ.customerLine();

		itemOne = cQ.getItemOne();
		itemTwo = cQ.getItemTwo();
		itemThree = cQ.getItemThree();
		itemFour = cQ.getItemFour();
		itemFive = cQ.getItemFive();
		itemSix = cQ.getItemSix();
	}
	
	/**
	 * setters and getters for amount of food items available to choose from
	 */
	public int getFoodOne(){
		return foodOne;
	}
	
	public void setFoodOne(int foodOne){
		this.foodOne = foodOne;
	}
	
	public int getFoodTwo(){
		return foodTwo;
	}
	
	public void setFoodTwo(int foodTwo){
		this.foodTwo = foodTwo;
	}
	
	public int getFoodThree(){
		return foodThree;
	}
	
	public void setFoodThree(int foodThree){
		this.foodThree = foodThree;
	}
	
	public int getFoodFour(){
		return foodFour;
	}
	
	public void setFoodFour(int foodFour){
		this.foodFour = foodFour;
	}
	
	public int getFoodFive(){
		return foodFive;
	}
	
	public void setFoodFive(int foodFive){
		this.foodFive = foodFive;
	}
	
	public int getFoodSix(){
		return foodSix;
	}
	
	public void setFoodSix(int foodSix){
		this.foodSix = foodSix;
	}
	
	
	/**
	 * For the customers who ordered from the menu provided
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