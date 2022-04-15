package LinkedList;

public class loop {
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
    public void checkLoop(){
        Node slowPtr=head;
        Node fastPtr=head;
        int flag=0;
        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Loop found");
        }else
            System.out.println("No Loop Found");
    }

    public static void main(String[] args) {
        loop ll=new loop();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
//        ll.addNode(4);
//        ll.addNode(5);
       ll.head.next.next.next= ll.head;
        ll.checkLoop();
    }
}
