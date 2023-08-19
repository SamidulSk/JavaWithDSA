import java.util.Scanner;

class Function5 {
    public static void primeOrNot(int n) {
        int count = 0;
        if (n < 2) {
            System.out.println(n + " is not a prime number");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2) {
            System.out.println(n + "  is not a prime number");
        } else {
            System.out.println(n + "  is a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeOrNot(n);
    }
}