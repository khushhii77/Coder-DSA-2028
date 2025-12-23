// Topic: Linked List II
// Problem: Add Two Numbers
// Description:
// Two non-empty linked lists represent two non-negative integers.
// Digits are stored in reverse order. Add the two numbers and return the sum as a linked list.
// Approach: Digit-wise addition with carry
// Time Complexity: O(max(n, m))
// Space Complexity: O(1)

class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
            next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);   // dummy node
        ListNode temp = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return head.next;
    }
}
