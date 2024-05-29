// print in increasing order from 1 to n
public class OnetoN {
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=7;
        printInc(n);
    }
}
