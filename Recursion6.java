// array is sorted or not using recursion
class Recursion6{
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        else
        {
            return isSorted(arr, i+1);
        }
    }
    public static void main(String args[]){
     int arr[]={7,8,3};
     System.out.println(isSorted(arr, 0));
    }
}