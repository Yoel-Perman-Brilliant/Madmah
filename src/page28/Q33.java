package page28;

public class Q33 {
    public static void printMatrix(int[][] matrix, int row, int column) {
        if (row == matrix.length - 1 && column == matrix[matrix.length - 1].length - 1) {
            System.out.print(matrix [row][column]);
        }
        else if (column == matrix[row].length - 1) {
            System.out.print(matrix[row][column] + "\n");
            printMatrix(matrix, row + 1, 0);
        }
        else {
            System.out.print(matrix[row][column] + "\t");
            printMatrix(matrix, row, column + 1);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 5}, {6, 7, 9}, {1, 2, 3}, {6, 7, 8}};
        printMatrix(matrix, 0, 0);
    }
}
