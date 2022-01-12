package page26;

public class SomethingElse {
    public static boolean allEven(int n) {
        if (n < 10)
            return n%2 == 0;
        else
            return (n%2 == 0 && allEven(n/10));
    }

    public static void main(String[] args) {
        System.out.println(allEven(8888));
    }

    public static boolean exists(int num, int digit) {
        if (num < 10)
            return num == digit;
        else
            return num%10 == digit || exists(num/10, digit);
    }
}
