import java.util.ArrayList;

public class Operations {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isempty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (list.size() == 0) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(8);
        s.push(4);
        s.push(2);
        s.pop();
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
