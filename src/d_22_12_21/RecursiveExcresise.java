package d_22_12_21;

public class RecursiveExcresise {
    public static int multiply(int x, int y) {
        if (y == 0)
            return 0;
        else
            return multiply(x, y - 1) + x;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
    }
}
