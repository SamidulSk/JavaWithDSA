import java.util.Scanner;

class Fuction7{
    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     average(a, b, c);

     }
    }
