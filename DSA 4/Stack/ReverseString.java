import java.util.Stack;

public class ReverseString {
    public static String revString(String str){
        Stack<Character>s=new Stack<>();
        int i=0;
        while (i<str.length()) {
          s.push(str.charAt(i));
          i++;  
        }
        StringBuilder result =new StringBuilder();
        while (!s.isEmpty()) {
           char curr=s.pop();
           result.append(curr);            
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="samidul";
        System.out.println(revString(str));

    }
}
