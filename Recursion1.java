// print number from 10 to 1
public class Recursion1{
    public static void printNum(int n){
        if(n==1){                   // find base case
            System.out.print(n);
            return;
        }
        else
        System.out.print(n+" ");  // actual work
        printNum(n-1);            //inner function call
    }
    public static void main(String args[]){
       int n=10;
       printNum(n);
    }
}