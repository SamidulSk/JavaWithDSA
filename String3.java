// check string is palindrome or not
class String3 {
    public static boolean ispalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("This is not palindrom");
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "madam";
        ispalindrome(str);
    }
}