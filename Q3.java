// calculator

import java.util.Scanner;

public class Q3{
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println( "Enter the first number");
   int a=sc.nextInt();
   System.out.println( "Enter the second number");
   int b=sc.nextInt();
   System.out.println("Enter + for add, - for sub, * for mul , / for div and % for remainder");
   char ch=sc.next().charAt(0);
   switch(ch){
    case '+' : 
    System.out.println(" The sum is "+ (a+b));
    break;
    case '-' :
    System.out.println( "The sub is"+ (a-b));
    break;
    case '*' :
    System.out.println( "The mul is "+ (a*b));
    break;
    case '/':
    System.out.println( "The div is "+ (a/b));
    break;
    case '%':
    System.out.println( "The remainder is "+(a%b));
    break;
    default:
    System.out.println( "Plese enter valid symbol");
   }
    }
}