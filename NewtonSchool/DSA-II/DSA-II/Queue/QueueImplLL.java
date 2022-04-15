package Queue;

public class QueueImplLL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node rear = null, front = null;
    private static int count=0;

    public int dequeue() {
        Node temp = null;
        if (front == null) {
            System.out.println("Queue underflow");
        } else {
            temp = front;
            System.out.println("Removing Element" +" "+  temp.data);
            front = front.next;
            if (front == null) {
                rear = null;
            }
            count -= 1;
        }
        return temp.data;
    }
    public void enqueue(int item){
        Node node=new Node(item);
        System.out.println("Inserting Element" +" "+ item);
        if(front==null){
            front=node;
            rear=node;
        }else{
            rear.next=node;
            rear=node;
        }
        count +=1;
    }
    public int peek(){
        if(front==null){
            return -1;
        }else
            return front.data;
    }

    public static void main(String[] args) {
        QueueImplLL q=new QueueImplLL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("=========================");
        System.out.println("The front Element is" +" "+ q.peek());
        System.out.println("=========================");
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
