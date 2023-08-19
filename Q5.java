import java.util.*;

public class Q5 {
    public static int BtoD(int n) {
        int desimal = 0;
        for (int i = 0; n!=0; i++) {
            int number = n % 10;
            desimal = desimal + number * (int) Math.pow(2, i);
            n = n / 10;

        }
        return desimal;
    }

    public static void main(String args[]) {
        int n = 100;
        System.out.println(BtoD(n));
    }
}