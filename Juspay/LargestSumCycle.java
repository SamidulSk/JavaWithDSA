import java.util.*;

public class LargestSumCycle {
    public long largestSumCycle(int n, int[] edge) {
        // cnt array will count the indegree of each node
        int[] cnt = new int[n];

        for (int i : edge) {
            if (i != -1) cnt[i]++;
        }

        Queue<Integer> q = new LinkedList<>();

        /*
        A node with indegree = 0 is out of cycle.
        We'll mark that node visited and cut that node from the graph.
        To do so, find the edge from that node and decrease the indegree of edge[node] by 1.
        */

        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (cnt[i] == 0) {
                vis[i] = 1;
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            if (edge[node] == -1) continue;
            cnt[edge[node]]--;
            if (cnt[edge[node]] == 0) {
                vis[edge[node]] = 1;
                q.add(edge[node]);
            }
        }

        long ans = -1;

        for (int i = 0; i < n; i++) {
            if (vis[i] == 1) continue;
            int val = 0;
            for (int st = i; vis[st] == 0; st = edge[st]) {
                vis[st] = 1;
                val += st;
            }
            ans = Math.max(ans, val);
        }

        return ans;
    }
}
