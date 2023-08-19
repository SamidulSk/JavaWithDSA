import java.nio.channels.Pipe;

class Array2{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+3;
        }
    }
    public static void main(String args[]){
        int arr[]={2,5,6,4,9,8,1};
        printArray(arr);
        update(arr);
        printArray(arr);
    }
}