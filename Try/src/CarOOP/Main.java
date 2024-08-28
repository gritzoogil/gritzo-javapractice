package CarOOP;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println(car1.make);
		System.out.println(car1.model);
		System.out.println(car1.year);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		car1.drive();
		car1.brake();
		
		Car car2 = new Car();
		car2.make = "Ford";
		System.out.println(car2.make);
	}

}
