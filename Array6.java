// Binary search
class Array6{
    public static int BinarySearch(int arr[],int key){
        int low,mid,high;
        low=0;
        high=arr.length-1;
        while(low<=high){
         mid=(low+high)/2;
         if(arr[mid]==key)
         {
            return mid;
         }
         if(arr[mid]<key){
            low=mid+1;
         }
         else{
            high=mid-1;
         }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={10,23,25,36,48,52,65,74,85};
        int key=65;
        System.out.println("Index of key is: "+BinarySearch(arr, key));

    }
}