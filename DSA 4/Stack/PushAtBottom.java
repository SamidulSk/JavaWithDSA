import java.util.Stack;

public class PushAtBottom {
    public static void pushAtbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(8);
        pushAtbottom(s, 9);
        pushAtbottom(s, 1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
