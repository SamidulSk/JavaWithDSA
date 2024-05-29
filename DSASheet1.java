class DSASheet1 {
    public static void maxandminofarray(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("The minimum value in array is " + min);
        System.out.println("The maximum value in array is " + max);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 8, 7, 4, 9 };
        maxandminofarray(arr);
    }
}
