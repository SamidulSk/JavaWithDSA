// largest in array
class Array5{
    public static int MaxOfArray(int arr[]){
        int arrmax=Integer.MIN_VALUE;   //-infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arrmax){
                arrmax=arr[i];
            }
        }
        return arrmax;
    }
    public static void main(String args[]){
        int arr[]={20,54,2,88,45,44,74,55};
        int max=MaxOfArray(arr);
        System.out.println(max);

    }
}