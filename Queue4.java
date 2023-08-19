
// Queue using JCF
import java.util.*;

public class Queue4 {
    public static void main(String args[]) {
    Queue<Integer> q = new LinkedList<>(); //because Queue is a interface we can't create it's object,this linked list class implements Queue
        // Queue<Integer> q= new ArrayDeque<>(); // another class which implements Queue
        // Queue
        q.add(2);
        q.add(8);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}