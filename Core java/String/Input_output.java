//take a string as input and print its all latter 

import java.util.Scanner;

public class Input_output {
    public static void main(String args[]){
        System.out.println("Enter your string ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"- ");
        }
        System.out.println();
    }
}
