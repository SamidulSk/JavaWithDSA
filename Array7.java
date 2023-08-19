class Array7{
    public static void reverseArray(int arr[]){
        int first=0;int last=arr.length-1;
        while(first<last){
           int temp=arr[last];
           arr[last]=arr[first];
           arr[first]=temp;
           first++;
           last--;
        }
    }
    public static void main(String args[]){
        int arr[]={20,98,78,66,23,156,76};
         reverseArray(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
         }
         
    }
}