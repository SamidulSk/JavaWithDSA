package Array;
// check every element of array is distinct or not
public class Array10 {
    public static boolean isDistinct(int arr[]) {
  
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {

        int arr[] = { 34, 65, 34, 74, 64 };
        System.out.println(isDistinct(arr));
    }
}