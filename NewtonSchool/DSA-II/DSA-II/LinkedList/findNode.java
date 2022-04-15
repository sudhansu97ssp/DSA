package LinkedList;

public class findNode {
    public Node head;
    public Node tail;
    class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void printNthNode(int n){
        int len=0;
        Node temp=head;

        while(temp!=null){
            temp=temp.next;
            len++;
        }
    if(len<n)
        return;
    temp=head;
        for (int i = 1; i <(len-n+1) ; i++) {
             temp=temp.next;
        }
        System.out.println("The Nth node from the end of LinkedList is " + temp.data);
    }
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else
            tail.next=newNode;
            tail=newNode;
    }

    public static void main(String[] args) {
        findNode ll=new findNode();

        ll.addNode(20);
        ll.addNode(25);
        ll.addNode(12);
        ll.addNode(10);
        ll.addNode(16);
       // System.out.print ("The Nth Node is ");
        ll.printNthNode(3);
    }
}
