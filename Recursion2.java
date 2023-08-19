// print numbers from 1 to n
public class Recursion2{
    public static void printnumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        else
        printnumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
   printnumber(n);
    }
}