// rod cutting same as unbounded knapsack
public class DP9 {
    public static int rodCutting(int length[], int price[], int totalRoad) {
        int n = price.length;
        int dp[][] = new int[n + 1][totalRoad + 1];
         for(int i=0;i<n+1;i++){
            dp[i][0]=0;  // initialize 0th column as 0
         }
         for(int j=0;j<totalRoad;j++){
            dp[0][j]=0;
         }
         // now code
         for(int i=1;i<n+1;i++){
            for(int j=1;j<totalRoad+1;j++){
               if(length[i-1] <= j){ //valid
                dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);  
               }
                else{ // invalid
                    dp[i][j]=dp[i-1][j];

                }
            }
         }
         return dp[n][totalRoad];
    }
    
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int totalRoad=8;
        System.out.println(rodCutting(length, price, 8));
    }
}
