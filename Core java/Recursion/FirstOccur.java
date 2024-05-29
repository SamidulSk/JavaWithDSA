public class FirstOccur {
    public static int firstOccur(int arr[],int key, int i){
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
     public static void main(String[] args) {
        int arr[]={3,5,7,9,3,5};
        System.out.println(firstOccur(arr, 7, 0));
     }
}
