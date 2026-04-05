package FinalProject;

/** Final Project Node Class
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
public class Node {
    Task data;
    Node next;

    public Node(Task data) {
        this.data = data;
        this.next = null;
    }
}
