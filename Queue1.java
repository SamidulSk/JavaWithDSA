
import java.util.*;;

// Queue using array   // only remove done in O(n)
public class Queue1 {
    static class Queue { // class of queqe
        static int arr[]; // atributes of queue class
        static int size;
        static int rear;

        Queue(int n) { // contructor of queue class
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isempty function
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add function
        public static void add(int element) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = element;
        }

        // remove function
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int element = arr[0]; // store front
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];

                }
                rear = rear - 1;
                return element; // return front
            }
        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        // print Queue
        public static void printQueue() {

            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }

        // 2nd
        public static void print() {
            if (rear == -1) {
                System.out.println("Empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(4);
        q.add(2);
        q.add(8);
        q.add(5);
        q.add(9);

        // while (!q.isEmpty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }
         q.printQueue();
       // q.print();
    }
}