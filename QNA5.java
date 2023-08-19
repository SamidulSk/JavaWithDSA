// Write a program to find the factorial of a given number using recursion.

public class QNA5{
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else 
        return n*factorial(n-1);
    }
    public static void main(String args[]){
    System.out.println(factorial(4));
    }

}