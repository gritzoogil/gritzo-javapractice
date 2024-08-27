package uhm;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!");
		
		Scanner scanner = new Scanner(System.in);
		// Input number
		System.out.println("Enter the first number: ");
		float num1 = scanner.nextFloat();
		scanner.nextLine();
		
		// Input operation
		System.out.println("Enter the operator (+, -, *, /): ");
		String operation = scanner.nextLine();
		
		// Input second number
		System.out.println("Enter the second number: ");
		float num2 = scanner.nextFloat();
		scanner.nextLine();
		
		float result = 0;
		if (operation.equals("+")) {
			result = num1 + num2;
		} else if (operation.equals("-")) {
			result = num1 - num2;
		} else if (operation.equals("*")) {
			result = num1 * num2;
		} else if (operation.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println("Error.");
		}
			
		System.out.println("Result: " + result);
	}

}
