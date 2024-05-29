// 1 to n using while loop

import java.util.Scanner;

public class loop16 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number till you want to print number");
        int n= sc.nextInt();
        int i=1;
         while(i<=n){
            System.out.print(i +" ");
            i++;
         }

    }
}
