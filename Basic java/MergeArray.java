import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={1,3,5,7,9};
        int length1=arr1.length;
        int length2=arr2.length;
        int[] mergedArray = new int[length1 + length2];

        System.arraycopy(arr1, 0, mergedArray, 0, length1);
        System.arraycopy(arr2, 0, mergedArray, length1, length2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
