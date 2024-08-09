import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your string below\n");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        
        String str=bf.readLine();

        if(isPalindrome(str)){
            System.out.println(str+ " is a palindrome");
        }
        else{
            System.out.println(str+" is not palindrome");
        }
        
    }
}