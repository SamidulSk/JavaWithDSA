package Array;
// Print pairs
public class Array7 {
    public static void printPairs(int arr[]) {
        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println(totalPair);
    }

    public static void main(String args[]) {
        int arr[] = { 42, 32, 97, 06, 23, 16, 75, 33 };
        printPairs(arr);
    }
}
