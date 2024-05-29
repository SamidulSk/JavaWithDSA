// Odd or Even

import java.util.Scanner;

public class Condition11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("This is a Even number" );
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}
