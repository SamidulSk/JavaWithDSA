import java.util.Scanner;

public class Power {
    public static int power(int num, int pow) {
        int result = 1; // Initialize result to 1 since anything raised to the power of 0 is 1
        for (int i = 0; i < pow; i++) {
            result *= num; // Multiply result by num in each iteration
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int pow = sc.nextInt();
        System.out.println("Result: " + power(n, pow));
    }
}
