//Palindrome or not
public class Function28 {
    public static boolean palindromeOrNot(int number){
        int originalNumber = number; // Store the original number
        int revNum = 0;
        int lastDigit;
        while (number > 0){
            lastDigit = number % 10;
            revNum = revNum * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == revNum; // Compare with the original number
    }

    public static void main(String args[]){
        System.out.println(palindromeOrNot(121)); // This should print true
    }
}

