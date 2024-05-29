import java.util.Scanner;

public class Array2d {
    public static int findLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][4];
        System.out.println("Enter matrix here:-");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search function calling
        System.out.println("largest number in this 2-D array is " + findLargest(matrix));
    }
}
