import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofTwo {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the first number\n");
       InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        int n1=Integer.parseInt(bf.readLine());
        System.out.println("Enter the second number\n");
        int n2=Integer.parseInt(bf.readLine());
        System.out.println("The sum of two number is "+(n1+n2));
    }
}
