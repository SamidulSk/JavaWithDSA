import java.util.Scanner;

public class FactorialRecursion {
    public static int findFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact=n*findFact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findFact(n));
    }
}
