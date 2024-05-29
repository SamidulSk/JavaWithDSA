package Array;
// creating and taking input

import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        int marks[]= new int[30];
        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        
        System.out.println("Phy marks is "+marks[0]);
        System.out.println("Math marks is "+marks[1]);
        System.out.println("Chem marks is "+marks[2]);
    }
}
