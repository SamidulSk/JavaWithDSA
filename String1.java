import java.util.Scanner;

class String1{
    public static void main(String args[]){
        String str="SK ";
        String str2;
        str2=new String("Samidul ");
        Scanner sc=new Scanner(System.in);
       // String str3=sc.next();
        String str4=sc.nextLine();
        //concatenation
        String str5=str+str2+str4;
        System.out.println(str5);
        // print particular latter
        System.out.println(str5.charAt(5));
        System.out.println(str5.charAt(8));
    }
}