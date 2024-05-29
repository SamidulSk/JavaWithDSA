//calculate a^n using bit manupulation
public class FastExponential {
    public static int fastExponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {  // check lsb is 1 or not
                ans = ans * a;  // if LSB is 1 then multiply
            } 
            a = a * a;   // next time multiply by --
            n = n >> 1;    // right shift the number
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(fastExponential(n, 3));
    }
}
