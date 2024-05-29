import java.util.PriorityQueue;

public class PQobjectCompare{
    static class Student implements Comparable<Student> { // comparable interface
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) { // here override compareTo function of comparable interface
            return this.rank - s2.rank;  // compare based on rank (s2 in new object)
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("samidul", 45));
        pq.add(new Student("hell", 23));
        pq.add(new Student("harry", 76));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
