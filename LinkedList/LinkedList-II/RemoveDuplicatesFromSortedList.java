// Topic: Linked List II
// Problem: Remove Duplicates from Sorted Linked List
// Description:
// Given the head of a sorted linked list, delete all duplicates
// so that each element appears only once.
// Approach: Single traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class RemoveDuplicatesFromSortedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
            next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        ListNode curr = head;

        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;   // we skip duplicate
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
