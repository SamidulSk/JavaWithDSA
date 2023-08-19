import java.util.*;
class Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number which you want to show table");
        int a=sc.nextInt();
        int mul=1;
        System.out.println("Here is your table of "+ a);
        for(int i=1;i<=10;i++){
            mul=a*i;
            System.out.println(a+"*"+ i +"="+mul);
        }

    }
}