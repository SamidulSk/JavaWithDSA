import java.util.Scanner;

public class PrimeOrNot {
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number you want to check prime or not:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
    }
}
