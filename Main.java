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

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        int choice;

        // Loop until user exits
        do {
            System.out.println("\n--- Smart Study Planner ---");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. View Sorted Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {

                case 1:
                    // Get task details from user
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();

                    System.out.print("Enter priority (1 = high): ");
                    int priority = scanner.nextInt();

                    // Create and add task
                    manager.addTask(new Task(name, dueDate, priority));
                    System.out.println("Task added!");
                    break;

                case 2:
                    // Display all tasks
                    manager.displayAllTasks();
                    break;

                case 3:
                    // Display sorted tasks
                    manager.displaySortedTasks();
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } 
        while (choice != 4);

        scanner.close(); // Close scanner
    }
}