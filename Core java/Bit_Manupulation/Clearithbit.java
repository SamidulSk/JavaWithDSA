// set ith bit as 0
public class Clearithbit {
    public static int clearIthbit(int n, int i){
        return n& ( ~(1<<i));
    }
    public static void main(String args[]){
        int n=7;
        System.out.println(clearIthbit(n, 1));

    }
}
