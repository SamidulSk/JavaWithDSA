public class Spiral_matrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        // i-> row
        // j-> column

        while (startRow <= endRow && startCol <= endCol) {
            // print top border where row in fixed and column varey
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // print right where end column in fixed row is varey
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startRow==endRow){
                    break;  //  when we arrive to center
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 2, 3, 4, 1 },
                { 9, 8, 7, 6 },
                { 1, 0, 2, 5 },
                { 8, 6, 4, 5 }
        };
        printSpiral(matrix);
    }
}
