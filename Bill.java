import java.util.Scanner;

class Bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the price of pencil");
     float pencil=sc.nextFloat();
     System.out.println("Enter the price of pen");
     float pen=sc.nextFloat();
     System.out.println("Enter the price of eraser");
     float eraser=sc.nextFloat();
     float total=pencil+pen+eraser;
     double GST=total*0.18;
     double TotalBill=total+GST;
     System.out.println("Your total bill is "+TotalBill);
    }
}