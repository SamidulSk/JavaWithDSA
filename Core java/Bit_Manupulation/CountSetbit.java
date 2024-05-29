// count number of 1 in a number
public class CountSetbit {
    public static int countSetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 15;
        System.out.println(countSetbit(n));
    }
}
