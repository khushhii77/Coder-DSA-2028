// Topic: Queue Introduction
// Problem: Design Circular Queue
// Description: Implement circular queue supporting enqueue, dequeue, Front, Rear, isEmpty, isFull.
// Approach: Use circular indexing (rear+1)%size and count of elements.
// Time Complexity: O(1)
// Space Complexity: O(n)

class MyCircularQueue {
    int[] q;
    int size;
    int front;
    int rear;
    int cnt;

    public MyCircularQueue(int k) {
        size = k;
        q = new int[k];
        front = 0;
        rear = -1;
        cnt = 0;
    }

    public boolean enQueue(int val) {
        if (cnt == size) return false;

        rear = (rear + 1) % size;
        q[rear] = val;
        cnt++;
        return true;
    }

    public boolean deQueue() {
        if (cnt == 0) return false;

        front = (front + 1) % size;
        cnt--;
        return true;
    }

    public int Front() {
        if (cnt == 0) return -1;
        return q[front];
    }

    public int Rear() {
        if (cnt == 0) return -1;
        return q[rear];
    }

    public boolean isEmpty() {
        return cnt == 0;
    }

    public boolean isFull() {
        return cnt == size;
    }
}
