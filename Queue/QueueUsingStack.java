// Topic: Queue Introduction
// Problem: Implement Queue using Stacks
// Description: Implement FIFO Queue using two LIFO stacks.
// Support push, pop, peek, empty operations.
// Approach: Use two stacks: input stack pushes, output stack pops. Transfer elements only when needed.
// Time Complexity: Amortized O(1)
// Space Complexity: O(n)

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
