import java.util.Scanner;

class Function2 {
    public static int sum(int a, int b) {
        int total = a + b;
        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sum(x, y);

    }
}