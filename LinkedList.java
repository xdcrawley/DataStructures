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
    private Node head; // Head (first node) of the list

    // Add a task to the end of the linked list
    public void add(Task task) {
        Node newNode = new Node(task);

        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add new node at the end
        current.next = newNode;
    }

    // Remove a task by its name
    public void remove(String name) {
        // Check if list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head needs to be removed
        if (head.data.getName().equals(name)) {
            head = head.next;
            return;
        }

        Node current = head;

        // Traverse list to find the task
        while (current.next != null) {
            if (current.next.data.getName().equals(name)) {
                current.next = current.next.next; // Remove node
                return;
            }
            current = current.next;
        }

        // If task was not found
        System.out.println("Task not found.");
    }

    // Display all tasks in the list
    public void display() {
        Node current = head;

        // Traverse and print each task
        while (current != null) {
            current.data.displayTask();
            current = current.next;
        }
    }

    // Get the head of the list
    public Node getHead() {
        return head;
    }

    // Set the head (used after sorting)
    public void setHead(Node head) {
        this.head = head;
    }

    // MERGE SORT IMPLEMENTATION
    // Public method to sort list by priority
    public void sortByPriority() {
        head = mergeSort(head);
    }

    // Recursive merge sort method
    private Node mergeSort(Node head) {
        // Base case: 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle of list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        // Split list into two halves
        middle.next = null;

        // Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Merge sorted halves
        return merge(left, right);
    }

    // Merge two sorted linked lists
    private Node merge(Node left, Node right) {
        // Base cases
        if (left == null) return right;
        if (right == null) return left;
        Node result;

        // Compare priorities (lower number = higher priority)
        if (left.data.getPriority() <= right.data.getPriority()) {
            result = left;
            result.next = merge(left.next, right);
        } 
        else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    // Find middle node using slow/fast pointers
    private Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head;
        Node fast = head;

        // Move fast pointer twice as fast as slow
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow pointer is at middle
    }
}