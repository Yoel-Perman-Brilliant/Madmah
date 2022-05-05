package b21_2;

public class Q3 {

    public boolean isCorner(int[][] a) {
        if (a.length != a[0].length)
            return false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i >= j && a[i][j] != j + 1)
                    return false;
                if (i < j && a[i][j] != i + 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
