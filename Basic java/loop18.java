// reverser number using while loop

import java.util.Scanner;

public class loop18 {
    public static void main(String args[]){
     
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse:-");
        int number=sc.nextInt();
        int revNum=0;
        while(number>0){
            int lastDigit=number%10;
            number/=10;
            revNum=(revNum*10)+lastDigit;
        }
        System.out.println(revNum);
    }
}
