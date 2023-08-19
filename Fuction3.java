import java.util.Scanner;
class Fuction3 {
    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The multiplication of two number is:"+multiplication(x, y));

    }
}