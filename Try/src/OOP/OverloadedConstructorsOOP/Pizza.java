package OverloadedConstructorsOOP;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	// repeating constructor names but different parameters.
	// name + parameter = signature (must be unique).
	
	Pizza(String bread, String sauce, String cheese, String topping) { // 4 parameters
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	Pizza(String bread, String sauce, String cheese) { // 3 parameters
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread, String sauce) { // 2 parameters
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread) { // 1 parameter
		this.bread = bread;
	}
	
	Pizza() { // 0 parameters
	}
}
