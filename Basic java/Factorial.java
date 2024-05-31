import java.util.Scanner;

public class Factorial{
    public static int findFact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want to calculate factorial ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findFact(n));
    }
}