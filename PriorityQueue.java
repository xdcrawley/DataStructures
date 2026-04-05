package FinalProject;

/** Final Project Priority Queue Class
* Xander Crawley - xdcrawley
* CIS153 23909
* April 2, 2026
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
public class PriorityQueue {
    private Node front;

    // Insert in priority order
    public void enqueue(Task task) {
        Node newNode = new Node(task);

        if (front == null || task.getPriority() < front.data.getPriority()) {
            newNode.next = front;
            front = newNode;
            return;
        }

        Node current = front;
        while (current.next != null &&
               current.next.data.getPriority() <= task.getPriority()) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove highest priority task
    public Task dequeue() {
        if (front == null) return null;

        Task temp = front.data;
        front = front.next;
        return temp;
    }

    // Display queue
    public void display() {
        Node current = front;
        while (current != null) {
            current.data.displayTask();
            current = current.next;
        }
    }
}