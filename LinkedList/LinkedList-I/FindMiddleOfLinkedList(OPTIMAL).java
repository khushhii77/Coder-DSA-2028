// Topic: Linked List I
// Problem: Find Middle of a Linked List
// Description: Return the middle node of a singly linked list.
// Approach: Slow & Fast Pointer (Optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

class FindMiddleOfLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // this is middle node
    }
}
