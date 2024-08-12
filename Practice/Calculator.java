import java.util.Scanner;

public class Calculator {
    public static int calculator(int num1, int num2, char ch) {
        switch (ch) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;

            default:
                return -1;

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number\n");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second number\n");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator\n");
        char ch = sc.next().charAt(0);
        System.out.println("The answer is " + calculator(num1, num2, ch));
    }
}