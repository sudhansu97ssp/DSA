package Queue;

public class ImplementationLL {

    //Creating nodes

    class Node{
    int data;
    Node next;
    public Node (int d){
       this.data=d;
       this.next=null;
    }
}
public Node head=null;
public Node tail=null;

//creating linked list with nodes

public void addNode(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }else
        tail.next=newNode;
    tail=newNode;
}

//Reverse LinkedList

    public void reverseLL(){
    Node current=head;
    Node prevNode=null;
    Node nextNode=null;

    while(current!=null){
        nextNode=current.next;
        current.next=prevNode;
        prevNode=current;
        current=nextNode;
    }
    this.head=prevNode;
}
//printing the linked list
public void printInfo(){
    Node current=head;
    if(head==null){
        System.out.println("List is Empty");
    }else

    while(current!=null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("Null");
}

//Driver code
    public static void main(String[] args) {
        ImplementationLL ll=new ImplementationLL();
        ll.addNode(1);
        ll.addNode(5);
        ll.addNode(8);
        ll.addNode(9);
        System.out.println("Nodes of singly LinkedList before reversal are");
        ll.printInfo();
        System.out.println("\n");
        ll.reverseLL();
        System.out.println("Nodes of singly Linked List after Reversal are");
        ll.printInfo();
    }
}
