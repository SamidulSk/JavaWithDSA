// longest common subsequence between two string (LCS)
public class DP10 {
    public static int lcs(String str1, int n, String str2, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcs(str1, n - 1, str2, m - 1) + 1; // add to lcs and decrease length and call for next
        } else {
            int ans1 = lcs(str1, n - 1, str2, m);
            int ans2 = lcs(str1, n, str2, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcs2(String str1, int n, String str2, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) { // same
            return dp[n][m] = lcs2(str1, n - 1, str2, m - 1, dp) + 1; // add to lcs and decrease length and call for
                                                                      // next
        } else {
            int ans1 = lcs2(str1, n - 1, str2, m, dp);
            int ans2 = lcs2(str1, n, str2, m - 1, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }

    // lcs tabulation
    public static int lcsTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        System.out.println(lcs(str1, n, str2, m));
        // memmoization
        // int dp[][] = new int[n + 1][m + 1];
        // for (int i = 0; i < n + 1; i++) {
        //     for (int j = 0; j < m + 1; j++) {
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(lcs2(str1, n, str2, m, dp));
        System.out.println(lcsTab(str1, str2));
    }
}
