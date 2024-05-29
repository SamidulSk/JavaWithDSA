// calculate power is in a optimized way with time complexity O(logn)
public class PowerOpt {
    public static int powerOpt(int x,int n){
        if(n==1){
            return x;
        }
         int pow=powerOpt(x, n/2);
         int power=pow*pow;
         if(n%2 != 0){
            power=power*x;
         }
         return power;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(powerOpt(x, n));
    }
}
