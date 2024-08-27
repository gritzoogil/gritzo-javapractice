package uhm;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;

public class TodoList {
	public static void main(String[] args) {
		Map<String, Boolean> tasks = new HashMap<>();
		
		System.out.println("Welcome to the To-Do List App!");
		System.out.println("1. Add a task");
		System.out.println("2. View tasks");
		System.out.println("3. Mark task as complete");
		System.out.println("4. Delete a task");
		System.out.println("5. Exit");
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean running = true;
		
		while (running) {
			System.out.print("\nEnter your choice: ");
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				case 1:
					addTask(tasks, scanner);
					break;
				case 2:
					viewTask(tasks);
					break;
				case 3:
					markTask(tasks, scanner);
					break;
				case 4:
					deleteTask(tasks, scanner);
					break;
				case 5:
					running = false;
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 5.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Try again.");
				scanner.next();
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
		}
		
		scanner.close();
	}
	
	static void addTask(Map<String, Boolean> tasks, Scanner scanner) {
		System.out.print("Enter the task: ");
		String task = scanner.nextLine();
		
		tasks.put(task, false);
		
		System.out.println("\nTask added succesfully!");
	}
	
	static void viewTask(Map<String, Boolean> tasks) {
		System.out.println("\nTasks:");
		int i = 1;
		for (Map.Entry<String, Boolean> entry : tasks.entrySet()) {
			String done = entry.getValue() ? "X" : " ";
            System.out.println("[" + done + "] " + i + ". " + entry.getKey());
            i++;
        }
	}
	
	static void markTask(Map<String, Boolean> tasks, Scanner scanner) {
		if (tasks.isEmpty()) { 
			System.out.println("No tasks available to mark as complete.");
			return;
		}
		
		viewTask(tasks);
		boolean validInput = false;
		int choice;
		
		while (!validInput) {
			System.out.print("\nEnter the task number to mark as complete: ");
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
				
				if (choice >= 1 && choice <= tasks.size()) {
					String taskKey = getKeyByIndex(tasks, choice - 1);
					if (taskKey != null) {
						tasks.put(taskKey, true);
						System.out.println("\nTask marked as complete!");
						validInput = true;
					}
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and " + tasks.size() + ".");
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
		}
	}
	
	static void deleteTask(Map<String, Boolean> tasks, Scanner scanner) {
		if (tasks.isEmpty()) { 
			System.out.println("No tasks available to mark as complete.");
			return;
		}
		
		viewTask(tasks);
		boolean validInput = false;
		int choice;
		
		while (!validInput) {
			System.out.print("\nEnter the task number to delete: ");
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
				
				if (choice >= 1 && choice <= tasks.size()) {
					String taskKey = getKeyByIndex(tasks, choice - 1);
					if (taskKey != null) {
						tasks.remove(taskKey);
						System.out.println("\nTask deleted succesfully!");
						validInput = true;
					}
				} else {
					System.out.println("Invalid choice. Please enter a number between 1 and " + tasks.size() + ".");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Try again.");
				scanner.next();
			}  catch (Exception e) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next();
			}
		}
	}
	
    static String getKeyByIndex(Map<String, Boolean> map, int index) {
        return map.keySet().stream().skip(index).findFirst().orElse(null);
    }

}
