// 0-1 Knapsack using Tabualation
public class DP5 {
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
         for(int i=0;i<dp.length;i++){
            dp[i][0]=0;  // initialize 0th column as 0
         }
         for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
         }
         // now code
         for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];   // value of ith item
                int w=wt[i-1];    // weight of ith item
                if(w <= j){   // valid
                int profit1=v+dp[i-1][j-w];  // include
                int profit2=dp[i-1][j]; // exclude
                dp[i][j]=Math.max(profit1, profit2);
                }  
                else{ // invalid
                    int profit2=dp[i-1][j];
                    dp[i][j]=profit2;

                }
            }
         }
         return dp[n][W];
    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
       System.out.println(knapsackTab(val, wt, W));
    }
}
