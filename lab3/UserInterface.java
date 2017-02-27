/**
 * 
 */
package lab3;

/**
 * @author Miguel Menjivar
 *
 */
public class UserInterface {
	GameEngine ge = new GameEngine();
	public void start(){
		System.out.println("Welcome to the program.\n");
		food();
		customers();
		
	}
	
	public void food(){
		ge.reloadFood();
		ge.checkFood();
		ge.checkMenu();
		
		System.out.println("The number of buns so far: " + ge.getFoodOne());
		System.out.println("The number of patties so far: " + ge.getFoodTwo());
		System.out.println("The number of lettuce so far: " + ge.getFoodThree());
		System.out.println("The number of tomatoes so far: " + ge.getFoodFour());
		System.out.println("The number of onions so far: " + ge.getFoodFive());
		System.out.println("The number of cheese so far: " + ge.getFoodSix() + "\n");
	}
	
	public void customers(){
		ge.checkCustomers();
		System.out.println("Customers that chose item #1: " + ge.getItemOne());
		System.out.println("Customers that chose item #2: " + ge.getItemTwo());
		System.out.println("Customers that chose item #3: " + ge.getItemThree());
		System.out.println("Customers that chose item #4: " + ge.getItemFour());
		System.out.println("Customers that chose item #5: " + ge.getItemFive());
		System.out.println("Customers that chose item #6: " + ge.getItemSix());


	}
}
