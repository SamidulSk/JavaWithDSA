//Selection Sort
//follow the C code for insertion sort
class InsertionSort{
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        //finding out the correct position of insert
        while(prev>=0&& arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1]=curr;
    }}
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={2,5,3,4,9,6,7};
        insertionsort(arr);
        Printarray(arr);
    }
}