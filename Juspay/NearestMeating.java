import java.util.*;

public class NearestMeating {

    static final long INF = Long.MAX_VALUE;

    public static List<Long> Dijkstra(List<List<Integer>> adj, int s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(Pair::getFirst));
        int v = adj.size();
        List<Long> ans = new ArrayList<>(Collections.nCopies(v, INF));
        ans.set(s, 0L);
        pq.add(new Pair(0L, s));

        while (!pq.isEmpty()) {
            long dist = pq.peek().first;
            int node = pq.poll().second;

            for (int i : adj.get(node)) {
                if (dist + 1 < ans.get(i)) {
                    ans.set(i, dist + 1);
                    pq.add(new Pair(dist + 1, i));
                }
            }
        }
        return ans;
    }

    public static int minimumWeight(int n, int[] edges, int C1, int C2) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                graph.get(i).add(edges[i]);
            }
        }

        List<Long> A = Dijkstra(graph, C1);
        List<Long> B = Dijkstra(graph, C2);

        int node = -1;
        long dist = INF;
        for (int i = 0; i < n; i++) {
            if (A.get(i) == INF || B.get(i) == INF)
                continue;
            if (dist > A.get(i) + B.get(i)) {
                dist = A.get(i) + B.get(i);
                node = i;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] edges = new int[n];
        for (int i = 0; i < n; ++i) {
            edges[i] = sc.nextInt();
        }

        int C1 = sc.nextInt();
        int C2 = sc.nextInt();

        int nearestMeetingCell = minimumWeight(n, edges, C1, C2);
        System.out.println(nearestMeetingCell);

        sc.close();
    }
}

class Pair {
    long first;
    int second;

    Pair(long first, int second) {
        this.first = first;
        this.second = second;
    }

    long getFirst() {
        return first;
    }

    int getSecond() {
        return second;
    }
}
