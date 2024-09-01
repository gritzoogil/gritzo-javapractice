package libManagementOOP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
	Book book;
	Patron patron;
	LocalDate loanDate;
	LocalDate dueDate;
	boolean returned;
	
	void markAsReturned() {
		returned = true;
	}
	
	boolean isOverdue() {
		LocalDate currentDate = LocalDate.now();
		return currentDate.isAfter(dueDate) && !returned;
	}
	
	double calculateFine() {
		boolean isOverdue = isOverdue();
		
		if (isOverdue) {
			LocalDate currentDate = LocalDate.now();
			double fineRate = 0.50;
			long overdueDays = ChronoUnit.DAYS.between(dueDate, currentDate);
			return overdueDays * fineRate;
		}
		return 0;
	}
}
