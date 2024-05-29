// calculator using switch case

import java.util.Scanner;

public class Calculatar13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Which operation you want to apply on it ?");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("The addition is " + (num1 + num2));
                break;
            case '-':
                System.out.println(" The Substraction is " + (num1 - num2));
                break;
            case '*':
                System.out.println(" The Multiplication is " + (num1 * num2));
                break;
            case '/':
                System.out.println(" The Division is " + (num1 / num2));
                break;
            case '%':
                System.out.println(" The Remainder is " + (num1 % num2));
                break;
            default: System.out.println("Enter right thing");
        }
    }
}
