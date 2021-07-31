 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<S> {
        Stack<S> stack1 = new Stack<S>();
        Stack<S> stack2 = new Stack<S>();

        public void enqueue(S value) { 
            stack1.push(value);
        }

        public S peek() {
             if (stack2.isEmpty()) {
                 while (!stack1.isEmpty()) {
                     stack2.push(stack1.pop());
                 }
             }
            return stack2.peek();
        }

        public S dequeue() {
            if (stack2.isEmpty()) {
                while(!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { 
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { 
                queue.dequeue();
            } else if (operation == 3) { 
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
