// insertion sort in java try by me
import java.util.*;
class InsertionsortMe{
    public static void insertionsort(int arr[]){
        int key,j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while( j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,5,46,32,1};                    //******************************** */
        Arrays.sort(arr,0,5);  // INBULIT SORT IN JAVA WITH TIME COMPLEXITY O(nlogn)      Arrays.sort(arr,start index,end index)
        Printarray(arr);
    }
}