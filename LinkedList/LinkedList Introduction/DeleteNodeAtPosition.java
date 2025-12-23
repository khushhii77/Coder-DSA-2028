class DeleteNodeAtPosition {
    static Node deleteAtPos(Node head, int pos) {

        if (head == null) return null;

        if (pos == 1) {
            return head.next;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
