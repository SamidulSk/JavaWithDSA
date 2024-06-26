
public class StackUsingLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class  Stack {
      static Node head=null;
      // isEmpty
      public static boolean isEmpty(){
        return head==null;
      }
      //push
      public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
      }
      // pop
      public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=head.data;
        head=head.next;
        return val;
      }
      //peek
      public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
      }
        
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(9);
        s.push(1);
        s.push(4);
        s.pop();
        while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();  
        }
    }
}
