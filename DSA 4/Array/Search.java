// search for value of target in a sorted array
public class Search {
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int target = 46;
        System.out.println(search(arr, target));
    }
}
