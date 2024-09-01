package libManagementOOP;

public class Book {
	static String title;
	static String author;
	static String isbn;
	static String genre;
	int copiesAvailable;
	
	public int borrowBook() {
		return copiesAvailable - 1;
	}
	
	public int returnBook() {
		return copiesAvailable + 1;
	}
	
	public boolean isAvailable() {
		return copiesAvailable > 0 ? true : false;
	}
}
