// Topic: Queue Introduction
// Problem: Implement Queue using Array
// Description: Implement a First In First Out (FIFO) queue using an array.
// Support operations: enqueue, dequeue, getFront, getRear, isEmpty, isFull
// Approach: Use circular array technique with front, rear, size, and capacity variables.
// Time Complexity: O(1) per operation
// Space Complexity: O(n)

class MyQueue {

    int[] arr;
    int front, rear, size, cap;

    // Constructor -> initializes queue
    public MyQueue(int n) {
        cap = n;
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == cap;
    }

    // Enqueue (push element at rear)
    public void enqueue(int x) {
        if (isFull())
            return;

        rear = (rear + 1) % cap;
        arr[rear] = x;
        size++;
    }

    // Dequeue (remove front element)
    public void dequeue() {
        if (isEmpty())
            return;

        front = (front + 1) % cap;
        size--;
    }

    // Get front element
    public int getFront() {
        if (isEmpty())
            return -1;

        return arr[front];
    }

    // Get rear element
    public int getRear() {
        if (isEmpty())
            return -1;

        return arr[rear];
    }
}
