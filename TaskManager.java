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
	private ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    // Add task
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Display all tasks
    public void displayTasks() {
        for (Task task : taskList) {
            task.displayTask();
        }
    }
}