// Topic: Linked List I
// Problem: Merge Two Sorted Linked Lists
// Description: Given two sorted linked lists, merge them into one sorted list.
// Approach: Iterative merge using dummy node (Optimal)
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // dummy node to store result
        ListNode n = new ListNode(0);
        ListNode temp = n;

        // we compare nodes and merge
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }
      
        if (list1 != null)  temp.next = list1;
        else temp.next = list2;

        return n.next;
    }
}
