// Brute Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

public static Node findMiddleBrute(Node head) {
    int count = 0;
    Node temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    int mid = count / 2;
    temp = head;

    for (int i = 0; i < mid; i++) {
        temp = temp.next;
    }

    return temp;
}
