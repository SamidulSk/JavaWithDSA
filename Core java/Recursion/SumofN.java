public class SumofN {
    public static int sumofN(int n){
        if(n==1){
            return 1;
        }
        return n+sumofN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumofN(4));
    }
}
