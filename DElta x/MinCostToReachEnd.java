import java.util.*;

public class MinCostToReachEnd {

    public static int minCostToReachEnd(List<Integer> A) {
        int N = A.size();
        if (N == 0) return 0; // Edge case: empty list
        if (N == 1) return 0; // Edge case: only one element

        int[] arr = new int[N + 1]; // 1-indexed array
        for (int i = 0; i < N; i++) {
            arr[i + 1] = A.get(i);
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        Queue<int[]> queue = new LinkedList<>(); // (current_index, current_cost)
        queue.add(new int[]{1, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int i = current[0];
            int current_cost = current[1];

            // Move to the next position
            if (i + 1 <= N && current_cost + 1 < dp[i + 1]) {
                dp[i + 1] = current_cost + 1;
                queue.add(new int[]{i + 1, current_cost + 1});
            }

            // Move to any position j where arr[j] is a multiple of arr[i]
            for (int j = i + 2; j <= N; j++) {  // Optimize by starting from i+2
                if (arr[j] % arr[i] == 0 && current_cost + arr[i] < dp[j]) {
                    dp[j] = current_cost + arr[i];
                    queue.add(new int[]{j, dp[j]});
                }
            }
        }

        return dp[N] == Integer.MAX_VALUE ? -1 : dp[N];
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2, 7, 9, 11, 4);
        System.out.println("Minimum cost to reach the end: " + minCostToReachEnd(A));
    }
}
