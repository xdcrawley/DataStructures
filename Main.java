package FinalProject;

import java.util.Scanner;

/** Final Project Main or Driver Class
* Xander Crawley - xdcrawley
* CIS153 23909
* March 27, 2026
*/
/*  
* OS: [Windows 11]
* IDE: [Eclipse XX]
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/
//Driver Class
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner for user input
        TaskManager manager = new TaskManager(); // Create TaskManager object

        int choice;

        // Loop continues until user chooses to exit
        do {
            System.out.println("\n--- Smart Study Planner ---");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. View Sorted Tasks");
            System.out.println("4. Remove Task");
            System.out.println("5. Update Task");
            System.out.println("6. View Priority Queue");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer after number input

            switch (choice) {
                case 1:
                    // Get task details from user
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();

                    System.out.print("Enter priority (1 = high): ");
                    int priority = scanner.nextInt();

                    // Create new task and add it
                    manager.addTask(new Task(name, dueDate, priority));
                    System.out.println("Task added!");
                    break;

                case 2:
                    // Display all tasks (unsorted)
                    manager.displayAllTasks();
                    break;

                case 3:
                    // Display tasks sorted by priority
                    manager.displaySortedTasks();
                    break;

                case 4:
                    // Remove a task by name
                    System.out.print("Enter task name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeTask(removeName);
                    break;

                case 5:
                    // Update a task (remove old, add new)
                    System.out.print("Enter task name to update: ");
                    String oldName = scanner.nextLine();

                    System.out.print("Enter new task name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new due date: ");
                    String newDate = scanner.nextLine();

                    System.out.print("Enter new priority: ");
                    int newPriority = scanner.nextInt();

                    // Perform update
                    manager.updateTask(oldName, new Task(newName, newDate, newPriority));
                    break;

                case 6:
                    // Display tasks in priority queue order
                    manager.displayPriorityTasks();
                    break;

                case 7:
                    // Exit program
                    System.out.println("Exiting...");
                    break;

                default:
                    // Handle invalid menu choice
                    System.out.println("Invalid choice.");
            }

        } 
        while (choice != 7);

        scanner.close(); // Close scanner to prevent resource leak
    }
}