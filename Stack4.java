
import java.util.*;

public class Stack4 {
    // Push to bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // reverse a string using Stack
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) { // pushing all charecter of String to Stack one by one
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder(""); // create a empty string
        while (!s.isEmpty()) {
            char curr = s.pop(); // pop charecter from stack
            result.append(curr); /// add result string
        }
        return result.toString(); // convert StringBuilder to string
    }

    // reverse a stack::-->> pop all element one by one from stack and pushAtBottom
    // one by one
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // print stack
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(4);
        s.push(3);
       // pushAtBottom(s, 8);
        printStack(s);

        // reverse call
        String result = reverseString("abcd");

        System.out.println(result);
        // call reverse stack
        reverseStack(s);     // run in different IDE
        printStack(s);

    }
}
