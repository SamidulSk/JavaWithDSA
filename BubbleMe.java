// bubble sort try by me
class BubbleMe{
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                 if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                 }
            }
        }
    }
 public static void Printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
 }
    public static void main(String argsp[]){
        int arr[]={4,2,9,8,1,2};
        bubblesort(arr);
        Printarray(arr);

    }
}