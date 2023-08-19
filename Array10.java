// calcute sum of all subarray and denode the max subarray   "''""  Brute Force"""
class Array10{
    public static void MaxSubarray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){ //subarray sum
                    currSum=currSum+arr[k];
                    
                }
                System.out.println(currSum);
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