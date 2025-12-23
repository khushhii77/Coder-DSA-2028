// Time: O(n)

class SearchNode {
    static boolean search(Node head, int key) {
        Node cur = head;

        while (cur != null) {
            if (cur.data == key) return true;
            cur = cur.next;
        }
        return false;
    }
}
