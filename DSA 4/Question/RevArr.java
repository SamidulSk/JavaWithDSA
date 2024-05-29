public class RevArr {
    public static void revArr(int arr[]){
        int start=0;
        int last=arr.length-1;
        while (start<last) {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;last--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,2,8,3,0};
        revArr(arr);
        printArray(arr);
    }
}
