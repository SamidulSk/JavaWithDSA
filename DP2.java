// Climbing Stairs -> aaoo siri chare

// using normal recursion  O(2^n)
// public class DP2 {
//     public static int countWays(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (n < 0) {
//             return 0;
//         }
//         return countWays(n - 1) + countWays(n - 2);
//     }

//     public static void main(String args[]) {
//         int n = 5; // 5 no siri pe janeka kitna tarike hai -> ways of 3 + ways of 4 -> 3+5 =8
//         System.out.println(countWays(n));
//     }
// }

// import java.util.Arrays;
// // using recursion+Memoization  O(n)
// public class DP2 {
//     public static int countWays(int n, int ways[]) {
//         if (n == 0) {
//             return 1;
//         }
//         if (n < 0) {
//             return 0;
//         }
//         if(ways[n] != -1){
//             return ways[n];  // already calculated
//         }
//         ways[n]=countWays(n-1, ways)+countWays(n-2, ways);
//         return ways[n];
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int ways[]=new int[n+1];  // 0 0 0 0 0 
//         Arrays.fill(ways, -1);    // -1 -1 -1 -1
//         System.out.println(countWays(n,ways));
//     }
// }

// using Tabulation O(n)

public class DP2 {
    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5; // 5 no siri pe janeka kitna tarike hai -> ways of 3 + ways of 4 -> 3+5 =8
        System.out.println(countWaysTab(n));
    }
}