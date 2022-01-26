package page28;

public class Q28 {
    public static void arithmeticSequence(double a1, double d, int n) {
        if (n > 1) {
            arithmeticSequence(a1, d, n - 1);
            System.out.println(a1 + d * (n - 1));
        }
        else
            System.out.println(a1);

    }

    public static void main(String[] args) {
        arithmeticSequence(3, 5, 8);
    }
}
