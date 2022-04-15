package LinkedList;

public class removeDuplicatesLL {
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
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }
    public Node removeDuplicates(Node head)
    {
        // do nothing if the list is empty
        if (head == null) {
            return null;
        }

        Node current = head;

        // compare the current node with the next node
        while (current.next != null)
        {
            if (current.data == current.next.data)
            {
                Node nextNext = current.next.next;
                current.next = nextNext;
            }
            else {
                current = current.next;    // only advance if no deletion
            }
        }

        return head;
    }

    public static void main(String[] args) {
        removeDuplicatesLL ll=new removeDuplicatesLL();
        ll.addNode(20);
        ll.addNode(25);
        ll.addNode(35);
        ll.addNode(35);
        ll.addNode(35);
        ll.addNode(40);
        ll.addNode(45);
        ll.addNode(58);
        ll.addNode(58);
        System.out.println("Linked List before removing Duplicates");
        ll.printList(ll.head);
        ll.removeDuplicates(ll.head);
        System.out.println("Linked List after removing Duplicates");
        ll.printList(ll.head);
    }
}
