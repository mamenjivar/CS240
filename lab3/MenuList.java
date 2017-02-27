/**
 * 
 */
package lab3;

/**
 * @author Miguel Menjivar
 *
 */
public class MenuList<T>{
	VectorList<String> burger = new VectorList<>();
	VectorList<String> cheeseBurger= new VectorList<>();
	VectorList<String> veganLettuceWrapBurger= new VectorList<>();
	VectorList<String> BurgerNoOnion = new VectorList<>();
	VectorList<String> cheeseBurgerNoOnion = new VectorList<>();
	VectorList<String> burgerNoTomato = new VectorList<>();
	
	/**
	 * List #1
	 */
	public void burgerItems(){
		burger.add("Bun");
		burger.add("Patty");
		burger.add("Lettuce");
		burger.add("Tomato");
		burger.add("onion");
		
		//burger.count();
	}
	
	/**
	 * list #2
	 */
	public void cheeseBurgerItems(){
		cheeseBurger.add("Cheese");
		cheeseBurger.add("Bun");
		cheeseBurger.add("Patty");
		cheeseBurger.add("Lettuce");
		cheeseBurger.add("Tomato");
		cheeseBurger.add("Onion");
	}
	/**
	 * The reason for two lettuces is because it has no bun nor patty
	 * it is stated that it has 2 orders of lettuce
	 * 
	 * list #3
	 */
	public void veganLettuceWrapBurgerItems(){
		//no bun
		//no patty
		veganLettuceWrapBurger.add("Lettuce");
		veganLettuceWrapBurger.add("Lettuce");
		veganLettuceWrapBurger.add("Tomato");
		veganLettuceWrapBurger.add("Onion");
		
	}
	
	/**
	 * list #4
	 */
	public void burgerNoOnionItems(){
		//no Onion
		BurgerNoOnion.add("Bun");
		BurgerNoOnion.add("Patty");
		BurgerNoOnion.add("Lettuce");
		BurgerNoOnion.add("Tomato");
	}
	
	/**
	 * list #5
	 */
	public void cheeseBurgerNoOnionItems(){
		//No onion
		cheeseBurgerNoOnion.add("Cheese");
		cheeseBurgerNoOnion.add("Bun");
		cheeseBurgerNoOnion.add("Patty");
		cheeseBurgerNoOnion.add("Lettuce");
		cheeseBurgerNoOnion.add("Tomato");
	}
	
	/** 
	 * list #6 
	 */
	public void burgerNoTomatoItems(){
		//no tomato
		burgerNoTomato.add("Bun");
		burgerNoTomato.add("Patty");
		burgerNoTomato.add("Lettuce");
		burgerNoTomato.add("Onion");
	}
	
	public void viewListOne(){
		
		System.out.println("burger items: " + burger.count());
		System.out.println("CheeseBurger items: " + cheeseBurger.count());
		System.out.println("Vegan Burger items: " + veganLettuceWrapBurger.count());
		System.out.println("Burger No Onion items: " + BurgerNoOnion.count());
		System.out.println("CheeseBurger No Onion items: " + cheeseBurgerNoOnion.count());
		System.out.println("Burger No Tomato items: " + burgerNoTomato.count());
		
	}
}