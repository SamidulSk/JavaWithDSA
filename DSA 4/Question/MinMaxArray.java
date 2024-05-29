// dsa 1
public class MinMaxArray {
    public static void findMax_Min(int arr[]) {
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
 
       for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
             max = arr[i];
          } 
          else if (arr[i] < min) {
             min = arr[i];
          }
       }
 
       System.out.println("Maximum element is = " + max);
       System.out.println("Minimum element is = " + min);
    }
 
    public static void main(String args[]) {
       int arr[] = { 2, 5, 1, 8, 4 };
       findMax_Min(arr);
    }
 }
 