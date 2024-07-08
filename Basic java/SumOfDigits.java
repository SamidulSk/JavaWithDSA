import java.util.Scanner;

public class SumOfDigits {
    public static int findSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastnum = n % 10;
            sum += lastnum;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all digits " + findSum(n));
    }
}
