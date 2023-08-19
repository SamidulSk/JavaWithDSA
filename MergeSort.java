import java.net.Socket;

// Merge sort using java
public class MergeSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
     // First Divide the array 
     int mid= si+(ei-si)/2;   // or  (si+ei)/2
     mergesort(arr, si, mid);
     mergesort(arr, mid+1,ei);
     merge(arr,si,mid,ei); // writing a fuction below for merge
    }
 public static void merge(int arr[],int si,int mid, int ei){
    int temp[]=new int[ei-si+1];
    int i=si; // iterator for letf part 
    int j=mid+1; // iterator for right part
    int k=0;     // iterator for temp arr
    while(i<=mid&& j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
            k++;
        }
        else{
            temp[k]=arr[j];
            j++;
            k++;
        }
    }
        // bacha hua element ko temp array pe add karo
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
            
        }
        // copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
         arr[i]=temp[k];
        }

    }
 
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8,-4};
        mergesort(arr, 0, arr.length-1);
        printArray(arr);

    }}
