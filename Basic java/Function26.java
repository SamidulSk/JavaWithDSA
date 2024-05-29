// binary to decimal
public class Function26 {
    public static int BtoD(int binary) {
        int decimal = 0;
        int pow = 0;
        int lastdigit;
        while (binary > 0) {
            lastdigit = binary % 10;
            decimal = decimal +( lastdigit * (int) Math.pow(2, pow));
            pow++;
            binary /= 10;
        }
        return decimal;
    }

    public static void main(String args[]) {
        System.out.println(BtoD(1010));
    }
}
