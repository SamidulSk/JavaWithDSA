package Array;
// auo array ko ulta karein
public class Array6 {
    public static void revArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp=arr[last];
            arr[last] = arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1,43, 74, 23, 8, 29,0};

        revArray(arr);
        printArray(arr);
    }
}
