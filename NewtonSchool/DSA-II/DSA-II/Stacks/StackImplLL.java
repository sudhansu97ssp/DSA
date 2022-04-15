package Stacks;

import static java.lang.System.exit;
public class StackImplLL {
    private class Node {

        int data; // integer data
        Node next; // reference variable Node type
    }
    Node top;
    // Constructor
    StackImplLL()
    {
        this.top = null;
    }

    public void push(int x) // insert at the beginning
    {

        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;
        temp.next = top;
        top = temp;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {

        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() // remove at the beginning
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).next;
    }

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%d->", temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackImplLL obj=new StackImplLL();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
