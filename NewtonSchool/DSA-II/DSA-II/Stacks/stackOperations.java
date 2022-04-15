package Stacks;

import java.util.*;

public class stackOperations {
    public static void push(Stack<Integer> st) {
        for (int i = 0; i <= 5; i++) {
            st.push(i);
        }
    }

    public static void pop(Stack<Integer> st) {
        if (st.isEmpty() == false) {
            int x = st.pop();
        }
    }

    public static void top(Stack<Integer> st) {
        int x = 0;
        if (st.isEmpty() == false) {
            x = st.peek();
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stackSize = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < stackSize; i++) {
        }
        int number = sc.nextInt();
        stack.push(number);
    }
}