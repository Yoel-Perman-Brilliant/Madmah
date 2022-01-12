package page26;

public class Q5 {
    public static int divide(int n1, int n2) {
        if (n1 - n2 < 0)
            return 0;
        else
            return divide(n1 - n2, n2) + 1;
    }

    public static void main(String[] args) {
        System.out.println(divide(19,4));
        System.out.println(divide(20, 4));
    }
}
