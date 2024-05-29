public class QusingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.err.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;

            }
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
      Queue q=new Queue();
      q.add(8);
      q.add(2);
      q.add(1);
      q.remove();
      q.add(9);
      while (!q.isEmpty()) {
        System.out.print(q.peek()+" ");
        q.remove();
      }
    }
}
