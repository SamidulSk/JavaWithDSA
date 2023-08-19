import java.util.Scanner;

public class Array1{
    public static void main(String args[]){

        //crate a array and assign value
        //***process 1 */
        // int arr[]=new int[20];
        // arr[0]=5;
        // arr[1]=7;
        // arr[2]=9;
       //****process 2 */
      //  int arr[]={5,7,9};

        //****process 3 */
        // int arr[]=new int[20];
        // Scanner sc=new Scanner(System.in);
        // arr[0]=sc.nextInt();
        // arr[1]=sc.nextInt();
        // arr[2]=sc.nextInt();
        int arr[]=new int[5];
        System.out.println("Enter the marks");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[1]);
    }
}