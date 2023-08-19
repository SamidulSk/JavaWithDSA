import java.util.Scanner;
// create a 2D array take elements from user
// find out the largeste element in matrix
public class Q7 {
    public static int[] findLargest(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        int[] cellIndex = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    cellIndex[0] = i; // row index
                    cellIndex[1] = j; // column index
                }
            }
        }
        
        return cellIndex;
    }

    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] largestCellIndex = findLargest(arr);
        int row = largestCellIndex[0];
        int column = largestCellIndex[1];
        System.out.println("The largest element is at cell (" + row + ", " + column + ").");
    }
}
