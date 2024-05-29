import java.util.*;

public class StackUsing2Q {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // add
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // remove
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int val = -1;
            // if elemets are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    val = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(val);
                }
            } else { // elemets are is q2
                while (!q2.isEmpty()) {
                    val = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(val);
                }
            }
            return val;
        }
        // peek also same as remove

    }

    public static void main(String[] args) {

           Stack s=new Stack();
           s.push(4);
           s.push(2);

    }
}
