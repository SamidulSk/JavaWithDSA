import java.util.Arrays;

class Pair{
    public int max;
    public int min;
}
public class MinMaxArray2 {
    static Pair getMinMax(int arr[]){
      Pair minmax= new Pair();
      Arrays.sort(arr);   
      minmax.min=arr[0];
      minmax.max=arr[arr.length-1];
      return minmax;
    } 
    public static void main(String[] args) {
        int arr[]={5,3,9,1,7};
        Pair minmaxVal=getMinMax(arr);
        System.out.println("Maximum element is = "+ minmaxVal.max);
        System.out.println("Minimum element is = "+ minmaxVal.min);
    }
}
