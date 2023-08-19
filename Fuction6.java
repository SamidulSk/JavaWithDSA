import java.util.Scanner;

class Fuction6{
    public static void table(int n){
        int mul=1;
        for(int i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number which you want to saw table");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        table(n);

    }
}