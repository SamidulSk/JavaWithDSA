import java.util.Scanner;

public class Calculator {
    public static int calculator(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return -1;
                }
            default:
                System.out.println("Error: Invalid operator. Please use one of +, -, *, /.");
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter any of the (+, -, *, /) operators:");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int result = calculator(num1, num2, operator);
        if (result != -1) {
            System.out.println("The result is: " + result);
        }
    }
}
