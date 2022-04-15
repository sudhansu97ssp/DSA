package LinkedList;
import java.util.*;
public class RemDupliUnSort {
    class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else
            tail.next=newNode;
        tail=newNode;
    }
     public void printList(Node temp ) {
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println("Null");
    }
    void removeDuplicate(Node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curr = current.data;

            // If current value is seen before
            if (hs.contains(curr)) {
                prev.next = current.next;
            }
            else {
                hs.add(curr);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        RemDupliUnSort ll=new RemDupliUnSort();
        ll.addNode(20);
        ll.addNode(26);
        ll.addNode(15);
        ll.addNode(20);
        ll.addNode(25);
        ll.addNode(26);
        ll.addNode(15);
        System.out.println("Linked List before removing Duplicates");
        ll.printList(ll.head);
        ll.removeDuplicate(ll.head);
        System.out.println("Linked List after removing Duplicates");
        ll.printList(ll.head);
    }
}
