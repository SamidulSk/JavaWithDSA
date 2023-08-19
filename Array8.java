// pairs in array
class Array8{
    public static void PrinntPair(int arr[]){
        int totoalpair=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];   //2,4,3......
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+ curr+","+arr[j]+")");
                totoalpair++;
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int arr[]={2,4,3,7,5};
        PrinntPair(arr);

    }
}