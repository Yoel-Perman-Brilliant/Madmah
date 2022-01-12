package page26;

public class Q4 {
    public static int digitSum(int n) {
        if (n == 0)
            return 0;
        else
            return digitSum(n/10)+n%10;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(6984));
    }
}
