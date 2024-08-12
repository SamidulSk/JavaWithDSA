import java.util.Scanner;

public class GCD {
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number\n");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second number \n");
        int num2 = sc.nextInt();
        System.out.println("The GCD of numbers is " + findGCD(num1, num2));
    }
}