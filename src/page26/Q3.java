package page26;

public class Q3 {
    public static int q3(int n) {
        if (n%2 == 0)
            return q3(n-1);
        if (n==1)
            return 1;
        else
            return n*q3(n-2);
    }

    public static void main(String[] args) {
        System.out.println(q3(5));
        System.out.println(q3(6));
    }
}
