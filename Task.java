package FinalProject;

/** Final Project Task Class
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
public class Task {
    private String name;
    private String dueDate;
    private int priority;

    public Task(String name, String dueDate, int priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    // Display method
    public void displayTask() {
        System.out.println("Task: " + name +
                " | Due: " + dueDate +
                " | Priority: " + priority);
    }
}