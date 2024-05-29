import java.util.LinkedList;
import java.util.Queue;

public class QusingJCF {

    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(8);
        q.add(2);
        q.add(1);
        q.remove();
        q.add(9);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
