// search in a sorted 2-D array
public class SortedSerch {
  public static boolean staircaseSearch(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col <= matrix[0].length - 1) {
            if (matrix[row][col] == key) {
                System.out.println("Key is found at (" + row + "," + col + ") index");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else if (key > matrix[row][col]) {
                col++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        System.out.println(staircaseSearch(matrix,10));
    }
}