import java.util.Scanner;

public class Condition12 {
    public static void main(String args[]) {
        System.out.println("Enter your income here , i calculate the tax amount you have to pay");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if (income < 500000) {
            tax = 0;
            System.out.println("You don't need to pay any income tax");
        } else if (income > 500000 && income < 1000000) {
            tax = 0.25f;
            System.out.println("You have to pay " + income * tax + " for income tax");
        } else if (income > 1000000) {
            tax = 0.3f;
            System.out.println("You hava to pay " + income * tax + "for income tax");
        }
    }
}
