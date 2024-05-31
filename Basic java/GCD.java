import java.util.Scanner;

public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("GCD: " + findGCD(a, b));
    }
}
