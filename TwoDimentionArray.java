import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class TwoDimentionArray {
    public static boolean Search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println(key + " found in index " + i + "," + j);
                    return true;
                }

            }
        }
        System.out.println(key + "NOT FOUND");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][4];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Enter your data");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 8);
    }

}
