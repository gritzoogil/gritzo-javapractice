package libManagementOOP;

import java.util.ArrayList;

public class Patron {
	String name;
	String patronID;
	String email;
	ArrayList<String> loanHistory = new ArrayList<>();
	ArrayList<String> currentLoans = new ArrayList<>();
	
	void borrowBook(Book book) {
		Library.borrowBook();
	}
	
	void returnBook(Book book) {
		currentLoans.remove(book);
		System.out.println("\nSuccessfully returned.");
	}
	
	void viewLoanHistory() {
		System.out.println("\nLoan History:");
		for (int i = 0; i < loanHistory.size(); i++) {
			System.out.println(loanHistory.get(i));
		}
	}
	
	double calculateFines() {
		System.out.println("\nTotal fines:");
		return 123.000;
	}
}
