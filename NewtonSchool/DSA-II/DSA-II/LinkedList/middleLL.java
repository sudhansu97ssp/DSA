package LinkedList;

import java.util.Scanner;

public class middleLL {
    class Node {
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void middleElement(){
        Node slowPtr =head;
        Node fastPtr =head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
        }
        System.out.println("Middle Element of LinkedList is"+ "["+slowPtr.data+"]");
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
    public void printInfo(){
        Node current=head;
        if(head==null){
            System.out.println("list is Empty");
        }else
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
        System.out.println("Null");
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        middleLL ll=new middleLL();
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            ll.addNode(i);
            ll.printInfo();
            ll.middleElement();
        }
    }
}
