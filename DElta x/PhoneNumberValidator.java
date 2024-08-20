import java.util.ArrayList;
import java.util.List;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String number) {
        int length = number.length();
        String digits;

        if (number.startsWith("+91")) {
            if (length != 15 || number.charAt(3) != ' ' || number.charAt(9) != ' ') {
                return false;
            }
            digits = number.substring(4, 9) + number.substring(10, 15);
        } else if (number.startsWith("0")) {
            if (length != 12 || number.charAt(6) != ' ') {
                return false;
            }
            digits = number.substring(1, 6) + number.substring(7, 12);
        } else if (number.startsWith("7") || number.startsWith("8") || number.startsWith("9")) {
            if (length != 10) {
                return false;
            }
            digits = number;
        } else {
            return false;
        }

        if (digits.length() != 10) {
            return false;
        }

        for (char ch : digits.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("+91 12345 67890");
        phoneNumbers.add("012345 67890");
        phoneNumbers.add("9123456789");
        phoneNumbers.add("+91 1234567890"); 
        phoneNumbers.add("01234567890");    
        phoneNumbers.add("8123456789");

        for (String number : phoneNumbers) {
            if (isValidPhoneNumber(number)) {
                System.out.println(number + " is valid.");
            } else {
                System.out.println(number + " is invalid.");
            }
        }
    }
}
