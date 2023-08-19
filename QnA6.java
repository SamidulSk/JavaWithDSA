import java.util.LinkedList;

// we have singly linked list of character, write a function that returns true if given list is a palindrome else false A->B->C->B->A
class QnA6 {

    public class Node { // node class
        char data; // attributes of node class
        Node next;

        public Node(char data) { // constructor of node class
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null; // define head
    public static Node tail = null;

    public void addFirst(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindromeOrNot() {
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid();
        // reverse 2nd part
        Node prev = null;
        Node curr = midNode;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        // check
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        QnA6 ll = new QnA6();
        ll.addFirst('A');
        ll.addFirst('B');
        ll.addFirst('C');
        ll.addFirst('B');
        ll.addFirst('A');
        ll.printll();
        System.out.println(ll.palindromeOrNot());

    }

}
