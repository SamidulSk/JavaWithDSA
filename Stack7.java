import java.util.Stack;

// find duplicate parenthesed exiest or not --->>>>O(n)
public class Stack7 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate exist
                } else {
                    s.pop();
                }
            }
            // opening
            else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String args[]) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str));    //this expression have duplicate parentheses
        System.out.println(isDuplicate(str2));    // this has no duplicate

    }

}