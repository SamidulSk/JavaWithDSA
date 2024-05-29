public class QucikSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotind=partition(arr,si,ei);
        quicksort(arr, si, pivotind-1);
        quicksort(arr, pivotind+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //initialy point in negetive index
        for(int j=si;j<ei;j++){ // find small then pivot
         if(arr[j]<=pivot){
            i++;
            // swap i and j
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
         }
        }
        // now swap i and pivot index
        i++; // push pivot next to i
        int temp=arr[ei];
        arr[ei]=arr[i]; // we have to swap with pivot index(ei) not with pivot varioble
        arr[i]=temp;
        return i;
    } 
    public static void main(String[] args) {
        int arr[]={4,2,7,8,3,2,-9};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
