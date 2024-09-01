package libManagementOOP;

import java.util.ArrayList;

public class Library {
	ArrayList<String> catalog = new ArrayList<>();
	ArrayList<String> patrons = new ArrayList<>();
	ArrayList<String> librarians = new ArrayList<>();
	
	boolean searchBook(String title) {
		if (catalog.contains(Book.title)) {
			System.out.println(Book.title + " has been found.");
			return true;
		} else {
			System.out.println("No book has this title. Not found.");
			return false;
		}
	}
	
	void borrowBook(Patron patron, Book book) {
		Book.borrowBook();
	}
}
