import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("please enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
