package FinalProject;

import java.util.ArrayList;
import java.util.Scanner;


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
    private LinkedList taskList;        // Stores all tasks
    private PriorityQueue priorityQueue; // Stores tasks by priority

    // Constructor
    public TaskManager() {
        taskList = new LinkedList();
        priorityQueue = new PriorityQueue();
    }

    // Add a new task to both structures
    public void addTask(Task task) {
        taskList.add(task);
        priorityQueue.enqueue(task);
    }

    // Display all tasks (unsorted)
    public void displayAllTasks() {
        System.out.println("All Tasks:");
        taskList.display();
    }

    // Display tasks sorted by priority using merge sort
    public void displaySortedTasks() {
        taskList.sortByPriority();
        System.out.println("Sorted Tasks (by priority):");
        taskList.display();
    }
}