import java.util.Scanner;

public class RomanNumber {

    public static int romanToInt(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int current = romanToInt(s.charAt(i));
            int next = (i + 1 < n) ? romanToInt(s.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }

    public static boolean isValidRomanNumeral(String s) {
        int n = s.length();
        int countI = 0, countX = 0, countC = 0, countM = 0;
        char lastChar = '\0';

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            char next = (i + 1 < n) ? s.charAt(i + 1) : '\0';
            int currentVal = romanToInt(current);
            int nextVal = romanToInt(next);

            if (current == lastChar) {
                if (current == 'V' || current == 'L' || current == 'D') return false;
                if (current == 'I') countI++;
                if (current == 'X') countX++;
                if (current == 'C') countC++;
                if (current == 'M') countM++;
                if (countI > 3 || countX > 3 || countC > 3 || countM > 3) return false;
            } else {
                if (current == 'I') countI = 1;
                if (current == 'X') countX = 1;
                if (current == 'C') countC = 1;
                if (current == 'M') countM = 1;
            }

            if (currentVal < nextVal) {
                if (current != 'I' && current != 'X' && current != 'C') return false;
                if (current == 'I' && next != 'V' && next != 'X') return false;
                if (current == 'X' && next != 'L' && next != 'C') return false;
                if (current == 'C' && next != 'D' && next != 'M') return false;
            }

            lastChar = current;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = scanner.nextLine();

        if (isValidRomanNumeral(input)) {
            System.out.println("Numeric equivalent: " + romanToInt(input));
        } else {
            System.out.println("Invalid");
        }
    }
}
