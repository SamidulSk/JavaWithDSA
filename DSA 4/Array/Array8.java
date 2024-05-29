package Array;
// subArray -> logic kd bhandar by me
public class Array8 {
    public static void printSubArrays(int arr[]) {
        int totalSubArray = 0;
        int max_subArray_sum = Integer.MIN_VALUE;
        int min_subArray_sum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                    if (sum > max_subArray_sum) {
                        max_subArray_sum = sum;
                    }
                    if (sum < min_subArray_sum) {
                        min_subArray_sum = sum;
                    }

                }
                totalSubArray++;
                System.out.print("Sum :=" + sum);
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("TotalSubArray " + totalSubArray);
        System.out.println("Maximum Subarray sum= " + max_subArray_sum);
        System.out.println("Minimum Subarray sum= " + min_subArray_sum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        printSubArrays(arr);
    }
}
