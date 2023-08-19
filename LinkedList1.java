public class LinkedList1 {
    public static class Node { // node class
        int data; // attributes of node class
        Node next;

        public Node(int data) { // constructor of node class
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null; // define head
    public static Node tail = null;

    // writing insertion at first fuction
    public void addFirst(int data) {
        Node newNode = new Node(data); // creating a newNode which is object of Node class
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // writing fuction for insertion at last
    public void addLast(int data) {
        Node newNode = new Node(data); // crating a new node
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLinkedList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    // writing a fuction for insert at any index
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node tempNode = head;
        int i = 0;
        while (i < index - 1) {
            tempNode = tempNode.next;
            i++;
        }
        // i =index-1; temp-> prev
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    // calculte size of linked list
    public int sizeOfList() {
        int size = 0;
        Node tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.next;
            size++;
        }
        return size;
    }

    // remove first element of linked list
    public int removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    // fuction for remove from last
    public int removeLast() {
        Node tempNode = head;
        for (int i = 0; i < sizeOfList() - 2; i++) {
            tempNode = tempNode.next;
        }
        int val = tail.data;
        tempNode.next = null;
        tail = tempNode;
        return val;
    }
 // search using Iteration
    public int search(int key) {
        Node tempNode = head;
        int i = 0;
        while (tempNode != null) {
            if (tempNode.data == key) {
                return i;
            }
            tempNode = tempNode.next;
            i++;
        }
        return -1;
    }
    // search using recursion
    public boolean search2(Node head, int key) {
        // Base case: If head is null, return false
        if (head == null) {
            return false;
        }
        
        // If key is found, return true
        if (head.data == key) {
            return true;
        }
        
        // Recursively search in the remaining linked list
        return search2(head.next, key);
    }
    public Node reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while (curr != null) {
            next = curr.next; // Save next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move to next nodes
            curr = next;
        }
        
        head = prev; // Set the new head of the linked list
        return head;
    }
    // delete Nth Node from end
    public void deleteNthfromEnd(int n){
        if(n==sizeOfList()){       // Nth from last means (size-n+1) from first
            head=head.next;        // remove first
              return;
        }
        // size-n
        int i=1;
        int index=sizeOfList()-n;
        Node prev=head;
        while(i<index){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // find mid of a linked list
    public Node findMid(Node head){  // slow & fast mehtod
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;  //+1
            fast=fast.next.next;  //+2

        }
        return slow;    // slow is my mid Node beacause fast complete whole list
    }
    public boolean palindromOrNot(){
        if(head== null || head.next==null){
            return true;
        }
        // step 1 -> find mid
        Node midNode=findMid(head);
        // step 2-> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next = null;
        
        while (curr != null) {
            next = curr.next; // Save next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move to next nodes
            curr = next;
        }
        Node right = prev; // when curr point to null then prev point to last node which is head of right part
        Node left= head;   // head of left half is our head
        
        // step3 -> check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    

    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1(); // creating object of linkedlist class
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(9);
        ll.add(3, 0);
        ll.printLinkedList();
        System.out.println("\nremove" + ll.removeFirst());
        ll.printLinkedList();
        System.out.println("\nremove" + ll.removeLast());
        ll.printLinkedList();
        System.out.println("\n size of list is " + ll.sizeOfList());
        System.out.println(ll.search(3));
        System.out.println(ll.search(10));
        System.out.println(ll.search2(head, 4));
        System.out.println(ll.search2(head, 44));
        ll.printLinkedList();
        ll.reverse();
        System.out.println("\nAfter reverce:\n");
        ll.printLinkedList();
        ll.deleteNthfromEnd(2); 
        System.out.println("\nAfter delete Nth node from last");
        ll.printLinkedList();
        System.out.println(ll.palindromOrNot());
    }
}
