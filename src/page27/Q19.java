package page27;

public class Q19 {
    public static boolean isInFirstN(int[] arr, int num, int n) {
        if (n < 0)
            return false;
        if (arr[n] == num)
            return true;
        return isInFirstN(arr, num, n - 1);
    }
    public static int numColumnsWithNumber(int[][] matrix, int num, int i) {
        if (i >= matrix.length)
            return 0;
        int addOn = 0;
        if (isInFirstN(matrix[i], num, matrix[i].length - 1))
            addOn = 1;
        return (numColumnsWithNumber(matrix, num, i + 1)) + addOn;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 6}, {7, 8, 9}, {1, 1, 7}};
        System.out.println(numColumnsWithNumber(matrix, 69, 0));
    }


}
