package FinalProject;

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

        TaskManager manager = new TaskManager();

        // Create test tasks
        Task t1 = new Task("Math Homework", "2026-04-01", 2);
        Task t2 = new Task("Study for Exam", "2026-03-30", 1);

        // Add tasks
        manager.addTask(t1);
        manager.addTask(t2);

        // Display tasks
        System.out.println("Task List:");
        manager.displayTasks();
    }
}
