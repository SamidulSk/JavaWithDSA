//Write a program to reverse a given string using loops.
public class QNA3{
    public static void main(String args[]){
        String str="samidul";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}