
// find next greater of all element of a array O(n)
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextgreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // we put index of element -> not the value
                s.pop(); // s.peek always return index -> because stack contain indexes
            }
            // 2 if-else
            if (s.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i); // here we push the index of element
        }

        // print
        for (int i = 0; i < nextgreater.length; i++) {
            System.out.print(nextgreater[i] + " ");
        }
        System.out.println();
    }
}
