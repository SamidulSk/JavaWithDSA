// count total number of ways to archive target sum (coin change)
// tabulation O(n*sum)
public class DP8 {
    public static int coinChange(int coins[],int sum){
      int n=coins.length;
      int dp[][]=new int[n+1][sum+1];
      // initialize
      //  i-> coin   j-> sum
      // sum is 0 -> coin to hay but kuj dena hi nahi hay -> 1 ways (na hi dun)
      for(int i=0;i<n+1;i++){
        dp[i][0]=1;
      }
      // coin =0; vai coin hi nahi hay to 0 ways hoga na
      for(int j=1;j<sum+1;j++){
        dp[0][j]=0;
      }
      // let fill dp
      for(int i=1;i<n+1;i++){
        for(int j=1;j<sum+1;j++){ 
            if(coins[i-1] <=j){ // valid coin ka size sum se kam hai to..
                dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
      }
      return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[]={1,2,3};
        int sum=4;
        System.out.println(coinChange(coins, sum));
    }
}
