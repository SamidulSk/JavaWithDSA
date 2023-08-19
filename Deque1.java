import java.util.LinkedList;
import java.util.*;

// Double Ended queue
public class Deque1{
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(8);
        deque.addFirst(2);
        deque.addFirst(5);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

    }
}