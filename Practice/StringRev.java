
import java.util.Scanner;

class StringRev {
    public static String revString(String str) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        char tempCh;

        while (i < j) {
            tempCh = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tempCh;
            i++;
            j--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println("Enter your string that you want to reverse:\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseString = revString(str);
        System.out.println("Reversed string: " + reverseString);
    }
}
