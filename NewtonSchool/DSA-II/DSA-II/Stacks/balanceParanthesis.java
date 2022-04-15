package Stacks;

import java.util.Scanner;
import java.util.Stack;

class balanceParenthesis {
        public static void main(String[] args)
        {
            int i, n;
            char ch;
            Scanner s = new Scanner(System.in);

            System.out.print("Enter the Expression: ");
            String exp = s.nextLine();

            Stack<Character> stack = new Stack<Character>();
            n = exp.length();

            for(i=0; i<n; i++)
            {
                ch = exp.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    stack.push(ch);
                }
                else if(ch==')')
                {
                    if(stack.isEmpty() || stack.pop() != '(')
                    {
                        System.out.println("not correct");
                        return;
                    }
                }
                else if(ch=='}')
                {
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        System.out.println("not correct");
                        return;
                    }
                }
                else if(ch==']')
                {
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        System.out.println("not correct");
                        return;
                    }
                }
            }
            if(stack.isEmpty())
                System.out.println("Correct");
        }
}