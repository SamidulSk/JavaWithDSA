import java.util.Stack;

public class ReverseStack {
    public static void pushAtbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revStack(s);
        pushAtbottom(s, top);

    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(8);
        s.push(2);
        s.push(3);
        revStack(s);
        printStack(s);

    }
}
