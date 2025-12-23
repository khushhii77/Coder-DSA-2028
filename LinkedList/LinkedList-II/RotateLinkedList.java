// Topic: Linked List II
// Problem: Rotate Linked List
// Description:
// Rotate the linked list to the right by k places.
// Approach: Count length + make list circular
// Time Complexity: O(n)
// Space Complexity: O(1)

class RotateLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
            next = null;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        // we will make it circular
        temp.next = head;

         int n = count-(k%count) ; //no.of steps

        ListNode newTail = temp;
        while (n-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
