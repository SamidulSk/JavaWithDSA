public class BinarySearch {
    public static int binarySearch(int arr[], int n) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 9, 13, 66};
        int n = 13;
        int result = binarySearch(arr, n);
        if (result != -1) {
            System.out.println(n + " is found at index " + result);
        } else {
            System.out.println(n + " is not found in the array");
        }
    }
}
