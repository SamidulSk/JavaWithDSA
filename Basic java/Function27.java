// decimal to binary
public class Function27 {
    public static int DtoB(int decimal) {
        int binary = 0;
        int pow = 0;
        int remainder;
        while (decimal > 0) {
            remainder = decimal % 2;
            binary=binary+remainder*(int)Math.pow(10, pow);
            pow++;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static void main(String args[]) {

        System.out.println(DtoB(10));
    }
}
