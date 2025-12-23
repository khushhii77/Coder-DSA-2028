class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
  
    static Node reverseList(Node head) {
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
