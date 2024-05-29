class DSASheet2 {
    public static void reverseArr(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Use print instead of println
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 6, 4, 9, 1 };
        reverseArr(arr);
        printArr(arr);
    }
}
