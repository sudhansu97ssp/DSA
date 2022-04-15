package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;

   public Node(int data){
       this.data=data;
       this.next=null;
   }
}

public class llImplementation {
    public Node head=null;
    public Node tail = null;

    public void addNode (int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
        tail=newNode;
        }else
            tail.next=newNode;
            tail=newNode;
    }
    public void display(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is Empty");
        }
        System.out.println("Nodes of singly Linked List");
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        llImplementation ll=new llImplementation();
        ll.addNode(sc.nextInt());
        ll.addNode(sc.nextInt());
        ll.addNode(sc.nextInt());
        ll.addNode(sc.nextInt());
        ll.display();
    }
}
