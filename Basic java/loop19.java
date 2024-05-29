// prime or not

import java.util.Scanner;

public class loop19 {
    public static void main(String args[]) {
        System.out.println("Enter the number which you want to check prime or not:-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("This is prime number");
        }
        else{
            System.out.println("jaldi aha se hato -> not prime");
        }
    }
}
