public class LastOccur {
    public static int lastoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
       int isfound= lastoccur(arr, key, i+1);
       if(isfound==-1 && arr[i]==key){
        return i;
       }
       return isfound;
    }
    public static void main(String[] args) {
        int arr[]={3,4,3,5,6,6,7,4,3};
        System.out.println(lastoccur(arr, 4, 0));
    }
}
