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
    private Node head; // Head of the linked list

    // Add task to end of list
    public void add(Task task) {
        Node newNode = new Node(task);

        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to end of list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add new node at the end
        current.next = newNode;
    }

    // Display all tasks
    public void display() {
        Node current = head;

        while (current != null) {
            current.data.displayTask();
            current = current.next;
        }
    }

    // Getter for head (used in sorting)
    public Node getHead() {
        return head;
    }

    // Setter for head (used after sorting)
    public void setHead(Node head) {
        this.head = head;
    }

    // =========================
    // MERGE SORT IMPLEMENTATION
    // =========================

    // Public method to start sorting
    public void sortByPriority() {
        head = mergeSort(head);
    }

    // Recursive merge sort function
    private Node mergeSort(Node head) {
        // Base case: empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Get middle of list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        // Split the list into two halves
        middle.next = null;

        // Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Merge sorted halves
        return merge(left, right);
    }

    // Merge two sorted lists
    private Node merge(Node left, Node right) {
        // Base cases
        if (left == null) return right;
        if (right == null) return left;

        Node result;

        // Compare priority values (lower = higher priority)
        if (left.data.getPriority() <= right.data.getPriority()) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    // Find middle node using slow/fast pointer method
    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head;

        // Move fast twice as fast as slow
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is at middle
    }
}