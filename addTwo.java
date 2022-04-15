package LinkedList;

public class addTwo {
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head1, head2;
    public static Node head = null;

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
    public Node addNumber(Node first, Node second) {
// return the head of the modified linked list
        Node h1 = reverse(first);
        Node h2 = reverse(second);
        Node ansHead = null;
        Node ansTail = null;
        int carry = 0;

        while (h1 != null && h2 != null) {
            int sum = h1.data + h2.data + carry;
            Node newNode = new Node(sum % 10);
            if (ansHead == null) {
                ansHead = newNode;
            } else {
                ansTail.next = newNode;
            }
            ansTail = newNode;
            carry = sum / 10;
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null) {
            int sum = h1.data + carry;
            Node newNode = new Node(sum % 10);
            if (ansHead == null) {
                ansHead = newNode;
            } else {
                ansTail.next = newNode;
            }
            ansTail = newNode;
            carry = sum / 10;
            h1 = h1.next;
        }
        while (h2 != null) {
            int sum = h2.data + carry;
            Node newNode = new Node(sum % 10);
            if (ansHead == null) {
                ansHead = newNode;
            } else {
                ansTail.next = newNode;
            }
            ansTail = newNode;
            carry = sum / 10;
            h2 = h2.next;
        }
        if (carry == 1) {
            ansTail.next = new Node(carry);
        }
        return ansHead;
    }

    //
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        addTwo ll = new addTwo();
        ll.head1 = new Node(1);
        ll.head1.next = new Node(9);
        ll.head1.next.next = new Node(9);
        ll.head1.next.next.next=new Node(9);
        System.out.println("1st LinkedList is");
        ll.printList(head1);
        ll.head2 = new Node(1);
        //ll.head2.next = new Node(9);
        System.out.println("2nd LinkedList is");
        ll.printList(head2);
        System.out.println("Sum of Two LinkedList is");
        Node res=ll.addNumber(head1,head2);
        Node ans=ll.reverse(res);
        ll.printList(ans);
    }
}
