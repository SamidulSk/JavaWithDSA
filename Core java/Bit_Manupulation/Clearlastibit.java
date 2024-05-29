public class Clearlastibit{
    public static int clearIbit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        int n=15;
        System.out.println(clearIbit(n, 2));
    }
}