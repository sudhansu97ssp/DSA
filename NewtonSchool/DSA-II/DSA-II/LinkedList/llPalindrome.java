package LinkedList;

public class llPalindrome {
    class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public int size;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    public Node reverse(Node temp){
        Node current=temp;
        Node prev=null;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public void printInfo(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is Empty");
        }else
            System.out.println("Nodes of LinkedList are");
        while(currNode!=null){
            System.out.print(currNode.data +" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public void isPalindrome() {
        Node current = head;
        boolean flag = true;
        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }
        Node revhead = reverse(current.next);
        while (head != null && revhead != null) {
            if (head.data != revhead.data) {
                flag = false;
                break;
            }
            head = head.next;
            revhead = revhead.next;
        }
        if(flag)
            System.out.println("Singly LinkedList is Palindrome");
        else
            System.out.println("Singly LinkedList is Not Palindrome");
    }
    public static void main(String[] args) {
        llPalindrome ll=new llPalindrome();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        ll.printInfo();
        ll.isPalindrome();
    }
}
