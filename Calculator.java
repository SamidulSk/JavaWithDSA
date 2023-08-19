import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=a/b;
        System.out.println("Enter 1 for Addition\n Enter 2 for Substraction\n Enter 3 for Mul\n Enter 4 for Division");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("The addition is "+ a+b);
            break;
            case 2:
            System.out.println("The substraction is"+ sub);
            break;
            case 3:
            System.out.println("The multiplication is "+mul);
            break;
            case 4:
            System.out.println("The divition is "+div);
            break;
            default:
            System.out.println("Please Entre valid number");
        }

    }
}