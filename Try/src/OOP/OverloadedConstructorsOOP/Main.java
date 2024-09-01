package OverloadedConstructorsOOP;

public class Main {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("Thin crust", "Tomato", "Mozzerella", "Pepperoni");
		System.out.println("Ingredients of your pizza: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);
		
		Pizza pizza2 = new Pizza("Thin crust", "Tomato", "American");
		System.out.println("\nIngredients of your pizza: ");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.cheese);
		System.out.println(pizza2.topping);
		
		
		Pizza pizza3 = new Pizza("Thick crust", "Tomato");
		System.out.println("\nIngredients of your pizza: ");
		System.out.println(pizza3.bread);
		System.out.println(pizza3.sauce);
		System.out.println(pizza3.cheese);
		System.out.println(pizza3.topping);
		
		Pizza pizza4 = new Pizza("Thin crust");
		System.out.println("\nIngredients of your pizza: ");
		System.out.println(pizza4.bread);
		System.out.println(pizza4.sauce);
		System.out.println(pizza4.cheese);
		System.out.println(pizza4.topping);
		
		Pizza pizza5 = new Pizza();
		System.out.println("\nIngredients of your pizza: ");
		System.out.println(pizza5.bread);
		System.out.println(pizza5.sauce);
		System.out.println(pizza5.cheese);
		System.out.println(pizza5.topping);
	}

}
