// maximum weight cell maze
import java.util.*;
public class Solution {
    public int maxWeightCell(int n, int[] edge) {
        int[] cnt = new int[n];
        Arrays.fill(cnt, 0);

        for (int i = 0; i < n; i++) {
            if (edge[i] != -1) {
                cnt[edge[i]] += i;
            }
        }

        int ans = -1;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (maxi <= cnt[i]) {
                maxi = cnt[i];
                ans = i;
            }
        }

        return ans;
    }
}
