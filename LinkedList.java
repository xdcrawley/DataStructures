package FinalProject;

/** Final Project Linked List Class
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
public class LinkedList {
    private Node head;

    // Add task to end
    public void add(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Remove task by name
    public void remove(String name) {
        if (head == null) return;

        if (head.data.getName().equals(name)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getName().equals(name)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Display all tasks
    public void display() {
        Node current = head;
        while (current != null) {
            current.data.displayTask();
            current = current.next;
        }
    }

    // Get head (used by other structures)
    public Node getHead() {
        return head;
    }
}