public class DiagonalSum {
    public static int diagonalsum(int matrix[][]) {
        // primary diagonal->i=j
        // secondary diagonal-> i+j->n-1;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // primary sum

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i]; // i+j=n-1 => j=n-1-i

            }

        }
        return sum;

    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 2, 3, 4, 1 },
                { 9, 8, 7, 6 },
                { 1, 0, 2, 5 },
                { 8, 6, 4, 5 }
        };
        System.out.println(diagonalsum(matrix));
    }
}
