import java.util.Stack;

// Queue using two stack
public class Queue5 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add    O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) { // remove all element of s1 while it is not empty
                s2.push(s1.pop()); // and store all element in s2
            }
            s1.push(data); // push new element in s1
            while (!s2.isEmpty()) { // now remove all element of s2
                s1.push(s2.pop()); // and push on s1
                                   // this store elements in FIFO mannner
            }
        }

        // remove O(1)
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is emptey");
                return -1;
            }
            return s1.pop(); // because first elemnent store in top not in bottom
        }

        // peek   O(1)
        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is emptey");
                return -1;
            }
            return s1.peek(); // return top
        }
    }

    

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(5);
        q.add(2);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }}
