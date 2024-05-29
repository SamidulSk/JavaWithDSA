package Array;
// find largest
public class Array4 {
    public static int findLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
          return largest;
    }
    public static void main(String args[]){
        int arr[]={43,65,32,76,34,578,64};

        System.out.println("Larges value in this array is : "+findLargest(arr));
    }
}
