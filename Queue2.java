// circular Queue  -->>> all operation done in O(1)
public class Queue2 {
    public static class Queue {
        static int arr[]; // atributes of queue class
        static int size;
        static int rear;
        static int front;

        Queue(int n) { // contructor of queue class
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }//isEmpty function
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }

        // isfullfunction
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add function
        public static void add(int element) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = element;
        }

        // remove function
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int element = arr[front];
            // last element

            if (rear == front) {
                rear = front = -1;
            } else {

                front = (front + 1) % size;
                
            }
            return element;

        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue(4);
        q.add(2);
        q.add(8);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}