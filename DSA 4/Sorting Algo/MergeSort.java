public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergesort(arr, si, mid); // left
        mergesort(arr, mid + 1, ei); // // right
        // out array is now divide in single element
        // now we merge all element
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        // rest element for left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // rest element for right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 2, 0, 9,-3 };
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
