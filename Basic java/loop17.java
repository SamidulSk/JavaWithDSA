// sum of n natural number using for loop

import java.util.Scanner;

public class loop17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to calculate sum :-");
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i <= n) {
          sum+=i;
          i++;
        }
        System.out.println("Total sum till "+ n + " is " + sum);
    }
}
