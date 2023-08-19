//********************THIS IS EPIC*************************** */
// all opertion on linked list
public class LinkedListTry1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // addAll
    public void addAll(int data, int index) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print Linked list
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // calculate size
    public int sizeofLL() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    // remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    // remove last
    public int removeLast() {
        Node temp = head;
        for (int i = 0; i < sizeofLL() - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        return val;
    }

    // search using iteration
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // search using recursion
    public boolean search2(Node head, int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return search2(head.next, key);
    }

    // revevse linked list
    public Node reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
        return head;
    }

    // find mid
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next;
            fast = fast.next.next;
        }
         
        return slow;
    }

    // palindrome or not
    public boolean palindromOrNot() {
        if(head==null && head.next==null){
            return true;
        }
        // step1->> find mid
        Node midNode = findMid(head);
        // step2->> reverse 2nd part
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
        // step3-->> check
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
        LinkedListTry1 ll = new LinkedListTry1();
        ll.addFirst(9);
        ll.addLast(2);
        ll.addLast(6);
        ll.addLast(4);
        ll.addAll(3, 1);
        ll.printLL();
        ll.sizeofLL();
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Searching for 6.....");
        System.out.println(ll.search(6));
        System.out.println(ll.search2(head, 6));
        ll.printLL();
        ll.reverse();
        ll.printLL();
       System.out.println(ll.palindromOrNot());
        
    }
}