// 0-1 Knapsack
// using simple recursion
import java.util.*;

public class DP3 {
    public static int kanpsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + kanpsack(val, wt, W - wt[n - 1], n - 1);   // we add items from last to first
            // exclude
            int ans2 = kanpsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else { // not valid
            return kanpsack(val, wt, W, n - 1);
        }
    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(kanpsack(val, wt, W, val.length));
    }
}

