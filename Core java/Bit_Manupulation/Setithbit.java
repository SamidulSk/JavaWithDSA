// set ith bit as 1
public class Setithbit {
public static int setIthbit(int n,int i){
    return n | 1<<i;
}
    public static void main(String args[]){
        int n=8;
System.out.println(setIthbit(n, 2));
    }
}
