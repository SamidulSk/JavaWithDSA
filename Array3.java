// Linear search
import java.util.Scanner;

class Array3{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
         return -1;
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        System.out.println("Enter the elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:  ");
         printArray(arr);
        System.out.println("Enter the key which you want to search");
        int key=sc.nextInt();
        int index=LinearSearch(arr,key);
        if(index==-1){
            System.out.println(key+" not found");
        }
        else{
            System.out.println("element is found on index no "+ index);
        }


       
    }
}