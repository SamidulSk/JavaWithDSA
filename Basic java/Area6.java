import java.util.Scanner;

public class Area6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Float radius = sc.nextFloat();
        float area = (float) 3.14 * radius * radius;
        System.out.println("The area is " + area);
    }
}
