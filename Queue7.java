import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Queue reversal
public class Queue7{
    public static void reverse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(6);
        q.add(9);
        q.add(2);
        q.add(8);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}