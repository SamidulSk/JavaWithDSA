// calcute sum of all subarray and denode the max subarray using prifix array
class Array11{                                   //prefix Sum
    public static void MaxSubarray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
               currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
    
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum is= "+maxSum);
    }

    public static void main(String argsp[]){
        int arr[]={2,-8,4,3,-2,5};
        MaxSubarray(arr);
    }
}