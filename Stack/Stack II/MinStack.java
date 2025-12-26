// Topic: Stack II
// Problem: Min Stack
// Description: Design a stack that supports push, pop, top and retrieving minimum element in O(1) time.
// Approach: We Maintain two stacks -> main stack + min stack
// min stack stores current minimum at each level
// Time Complexity: O(1) per operation
// Space Complexity: O(n)

import java.util.*;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    public void push(int val) {
        st.push(val);

        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }
    public void pop() {
        if (st.peek().equals(min.peek())) {
            min.pop();
        }
        st.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return min.peek();
    }
}
