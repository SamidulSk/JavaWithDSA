// how to create a node
public class Create {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        Create ll= new Create();
        ll.head=new Node(7);
        ll.head.next=new Node(9);
    }
}
