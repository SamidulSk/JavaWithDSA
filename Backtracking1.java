import java.nio.channels.Pipe;

// Backtracking of array
class Backtracking1{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void fillArray(int arr[],int i,int val){
        // Base case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        // Recursion
        arr[i]=val;
        fillArray(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        fillArray(arr, 0, 1);
        printArray(arr);

    }
}