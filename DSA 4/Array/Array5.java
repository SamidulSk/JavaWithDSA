package Array;
//Binary search
public class Array5 {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 14, 23, 55, 76, 88, 94 };
        int key = 94;
        System.out.println("This element is found in index no: " + binarySearch(arr, key));
    }
}
