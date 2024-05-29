// calculate x to the power n
public class Power {
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x=3;
        int n=4;
        System.out.println(power(x, n));
    }
}
