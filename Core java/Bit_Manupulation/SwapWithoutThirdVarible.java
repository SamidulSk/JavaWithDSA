// swap without using third variable x-or operator
public class SwapWithoutThirdVarible {
    public static void main(String args[]) {
        int x = 4;
        int y = 6;
        System.out.println("Before swap : x = " + x + " y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Before swap : x = " + x + " y = " + y);
    }
}
