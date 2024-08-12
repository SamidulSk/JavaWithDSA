public class BinarySearch {
    public static int binarySearch(int arr[],int n){
        int low=0;
        int high=arr.length-1;
        int mid;
        while (low<=high) {
           mid=low+(high-low)/2;
           if(arr[mid]==n){
            return mid;
           } 
           else if(n>arr[mid]){
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,8,12,45};
        int n=2;
        System.out.println("The number "+n+" is present of index no "+binarySearch(arr,n));
    }
}
