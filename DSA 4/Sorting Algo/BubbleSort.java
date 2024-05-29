public class BubbleSort {
    public static void bubblesort(int arr[]) {
        int totalswap = 0; 
        for (int turn = 0; turn < arr.length - 1; turn++) {
            totalswap = 0; 
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    totalswap++;
                }
            }
        }
        if (totalswap == 0) {
            System.out.println("Array is already sorted");
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1,2,3};
        bubblesort(arr);
        printArray(arr);
    }
}
