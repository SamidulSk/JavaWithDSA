import java.net.PortUnreachableException;
import java.util.Scanner;

class PrimeOrNot{
    public static void PrinmeorNot(int n){
        int div=1;
       // for(int i=2;i<n;i++)   {
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            div++;
        }}
        if(div>1){
            System.out.println("This is not a prime number");
        }
        else{
            System.out.println("This is a prime number");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter your number which you want to check prime or not");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrinmeorNot(n);
    }
}