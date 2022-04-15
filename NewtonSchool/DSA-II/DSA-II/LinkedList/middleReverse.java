package LinkedList;

public class middleReverse {
//    class Node{
//        int data;
//        Node next;
//        public Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public static Node head=null;
//    public Node tail=null;
//    public void addNode(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            tail=newNode;
//        }else
//            tail.next=newNode;
//            tail=newNode;
//    }
//    public static void main(String[] args) {
//        middleLL ll=new middleLL();
//        ll.addNode(1);
//        ll.addNode(2);
//        ll.addNode(3);
//        ll.addNode(4);
//        ll.addNode(5);
//        ll.addNode(6);
//        Node res = reverse(head);
//
//        Node node = head;
//        while (node != null)
//        {
//            System.out.println(node.data);
//            node = node.next;
//        }
//    }
//    public static Node reverse(Node start)
//    {
//        int counter = 0;
//        Node node = start;
//        Node pre = start;
//
//        Node result = start;
//
//        while (node!= null)// for count how many elements in linked list
//        {
//            counter += 1;
//            node = node.next;
//        }
//
//        for (int i=0; i< (counter / 2) ; i++)//no matter counter is even or odd, when it divided by 2, the result is even
//        {
//            pre = start;
//            start = start.next;
//        }
//
//
//        Node temp = null;
//        Node preNext = null;
//        while (start != null)
//        {
//            temp = start.next;
//            start.next = preNext;
//            preNext = start;
//            start = temp;
//        }
//        pre.next = preNext;
//
//        return start;

    //}
}
