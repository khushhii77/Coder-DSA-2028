// Topic: Linked List I
// Problem: Reverse a Linked List
// Description: Given the head of a singly linked list, reverse the list.
// Approach: Iterative Pointer Reversal (Optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev; 
    }
}
