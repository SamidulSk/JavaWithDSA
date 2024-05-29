public class Operations {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int search(int key) { // O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n)
        Node prev = null; // initialy prev is null
        Node curr = tail = head; // we reverse ll so tail become head
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;// update head at the end which is position of previous

    }

    // calculate size
    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void deleteNthfromEnd(int n) {
        if (n == size()) { // last se n matlab suruyat se head ko delete karna hai
            head = head.next; // remove first
            return;
        }
        int i = 1;
        Node prev = head;
        while (i < size() - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // find mid of linked list
    // slow fast approch
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 turtle
            fast = fast.next.next; // +2 hare
        }
        return slow; // slow is my mid node
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 find mid
        Node midNode = findMid(head);
        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // head of right half
        Node left = head;

        // check left half & right half
        while (right != null) { // end se arahahoon
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        // detect cycle present or not
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // if cycle = true move slow to head
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove connection of last node
        prev.next = null;
    }

    public Node mergeSort(Node head) { // because it return head or merge ll

        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // call left & right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node LH, Node RH) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (LH != null && RH != null) {
            if (LH.data <= RH.data) {
                temp.next = LH;
                LH = LH.next;
                temp = temp.next;
            } else {
                temp.next = RH;
                RH = RH.next;
                temp = temp.next;
            }
        }
        // for rest element
        while (LH != null) {
            temp.next = LH;
            LH = LH.next;
            temp = temp.next;
        }
        while (RH != null) {
            temp.next = RH;
            RH = RH.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public static void main(String[] args) {
        Operations ll = new Operations();
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addLast(3);
        ll.addLast(7);
        ll.print();
        ll.add(2, 6);
        ll.removeFirst();
        ll.removeLast();
        ll.removeLast();
        ll.print();
        System.out.println(size);
        System.out.println(ll.search(6));
        System.out.println(ll.recursiveSearch(6));
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
        System.out.println(ll.isPalindrome());
        System.out.println(ll.isCycle());
        ll.removeCycle();
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
}
