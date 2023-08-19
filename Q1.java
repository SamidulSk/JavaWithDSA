// multable of N

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = i * n;
            System.out.println(n +" * "+ i + "="+ mul);
        }
        System.out.println();
    }
}