// Doubly Linked list
public class LinkedList3{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size;
    //print
    public void printLinkedList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
    // add first 
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    // remove first
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    // addlast 


    // remove last


// reverse a DLL
public Node reverse() {
    Node prev = null;
    Node curr = head;
    Node next = null;
    
    while (curr != null) {
        next = curr.next; // Save next node
        curr.next = prev; // Reverse the link
        curr.prev=next;
        prev = curr; // Move to next nodes
        curr = next;
    }
    
    head = prev; // Set the new head of the linked list
    return head;
}
  
    public static void main(String args[]){
       LinkedList3 dll=new LinkedList3();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printLinkedList();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.printLinkedList();
        System.out.println(size);
        dll.printLinkedList();
        dll.reverse();
       System.out.println("after reverse");
      dll.printLinkedList();
    }
}