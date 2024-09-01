package ConstructorOOP;

public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("Drake", 65, 300.00);
		Human human2 = new Human("Rich", 19, 500.00);
		
		System.out.println(human1.name);
		System.out.println(human2.age);
		
		human1.eat();
		human2.drink();
	}

}
