import java.util.LinkedList;
import java.util.Queue;

// Stack implementation using two Queues
public class Queue6 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Add element to Stack
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Remove top element from Stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int element = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    element = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(element);
                }
            } else {
                while (!q2.isEmpty()) {
                    element = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(element);
                }
            }
            return element;
        }

        // Get top element of Stack without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int element = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    element = q1.remove();
                    q2.add(element);
                }
            } else {
                while (!q2.isEmpty()) {
                    element = q2.remove();
                    q1.add(element);
                }
            }
            return element;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(8);
        s.push(2);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
