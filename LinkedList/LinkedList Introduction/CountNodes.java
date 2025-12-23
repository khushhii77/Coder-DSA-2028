class CountNodes {
    static int count(Node head) {
        int cnt = 0;
        Node cur = head;

        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        return cnt;
    }
}
