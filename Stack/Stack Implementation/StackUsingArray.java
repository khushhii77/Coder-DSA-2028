// Topic: Stack Implementation
// Problem: Implement Stack using Array
// Description: Implement stack supporting push, pop, top and isEmpty operations
// Approach: Maintain top pointer
// Time Complexity: O(1)
// Space Complexity: O(n)

class StackUsingArray {
    int top;
    int arr[];

    StackUsingArray(int n){
        arr = new int[n];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void push(int x){
        arr[++top] = x;
    }
    int pop(){
        return arr[top--];
    }

    int peek(){
        return arr[top];
    }
    
}
