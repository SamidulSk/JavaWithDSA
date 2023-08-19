import java.util.Scanner;

class Fuction10 {
    public static long power(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++)
            pow *= a;
        return pow;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The power of a and b is "+ power(x, y));

    }
}