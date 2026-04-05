package FinalProject;

import java.util.ArrayList;

/** Final Project Task Manager Class
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
// So far is just the basic structure
public class TaskManager {
    private LinkedList taskList;
    private PriorityQueue priorityQueue;

    public TaskManager() {
        taskList = new LinkedList();
        priorityQueue = new PriorityQueue();
    }

    // Add task
    public void addTask(Task task) {
        taskList.add(task);
        priorityQueue.enqueue(task);
    }

    // Remove task
    public void removeTask(String name) {
        taskList.remove(name);
        // Note: PriorityQueue removal will be improved later if needed
    }

    // Display all tasks
    public void displayAllTasks() {
        System.out.println("All Tasks:");
        taskList.display();
    }

    // Display priority tasks
    public void displayPriorityTasks() {
        System.out.println("Priority Tasks:");
        priorityQueue.display();
    }
}