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
public class TaskManager {
    private LinkedList taskList; // Stores all tasks
    private PriorityQueue priorityQueue; // Stores tasks sorted by priority

    // Constructor initializes both structures
    public TaskManager() {
        taskList = new LinkedList();
        priorityQueue = new PriorityQueue();
    }

    // Add a new task
    public void addTask(Task task) {
        taskList.add(task); // Add to linked list
        rebuildPriorityQueue(); // Rebuild queue to keep it updated
    }

    // Remove a task by name
    public void removeTask(String name) {
        taskList.remove(name); // Remove from list
        rebuildPriorityQueue(); // Sync queue after removal
    }

    // Update a task (remove old and add new)
    public void updateTask(String oldName, Task newTask) {
        taskList.remove(oldName); // Remove old task
        taskList.add(newTask); // Add updated task
        rebuildPriorityQueue(); // Sync queue
    }

    // Rebuild priority queue from linked list
    // Ensures queue always reflects current tasks
    private void rebuildPriorityQueue() {
        priorityQueue = new PriorityQueue(); // Reset queue

        Node current = taskList.getHead();

        // Traverse list and re-add tasks to queue
        while (current != null) {
            priorityQueue.enqueue(current.data);
            current = current.next;
        }
    }

    // Display all tasks (unsorted)
    public void displayAllTasks() {
        if (taskList.getHead() == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("All Tasks:");
        taskList.display();
    }

    // Display tasks sorted by priority
    public void displaySortedTasks() {
        if (taskList.getHead() == null) {
            System.out.println("No tasks to sort.");
            return;
        }

        taskList.sortByPriority(); // Apply merge sort
        System.out.println("Sorted Tasks (by priority):");
        taskList.display();
    }

    // Display tasks from priority queue
    public void displayPriorityTasks() {
        if (taskList.getHead() == null) {
            System.out.println("No tasks in priority queue.");
            return;
        }

        System.out.println("Priority Queue:");
        priorityQueue.display();
    }
}