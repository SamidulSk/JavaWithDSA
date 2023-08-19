import java.util.Scanner;

public class Function8 {
    public static int sumOfOdds(int n) {
        int sum=1;
        for (int i = 0; i <= n; i++) {
            if (i% 2 != 0){
                sum = sum + i;}}
            return sum;
        }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all Odds number till " + n + " is " + sumOfOdds(n));
    }
}
