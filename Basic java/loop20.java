// factorial

import java.util.Scanner;

public class loop20 {
    public static void main(String args[]) {
        System.out.println("Enter the number which you want to calculate factorial:-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        if (number == 0 || number == 1) {
            System.out.println("The factorial of this number is 1");
        } else {
            for (int i = number; i > 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of this number is " + factorial);
        }

    }
}
