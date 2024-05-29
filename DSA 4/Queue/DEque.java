import java.util.*;

public class DEque {
    public static void main(String[] args) {
        Deque<Integer>deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeFirst();
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        deque.addLast(8);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println();
    }
}
