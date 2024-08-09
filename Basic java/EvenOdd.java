import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter the number\n");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        int n=Integer.parseInt(bf.readLine());
        if(n%2==0){
            System.out.println(n+" is  a even number");
        }
        else{
            System.out.println(n+" is  a odd number");
        }
    }
}
