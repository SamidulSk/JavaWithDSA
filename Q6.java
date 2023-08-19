// print pattern 
//A
//B C
//D E F
//G H I J
public class Q6 {
    public static void main(String args[]) {
        char ch = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

                ch++;
            }
            System.out.println();
        }
    }
}