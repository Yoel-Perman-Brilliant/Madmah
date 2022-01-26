package page28;

public class Q29 {
    public static void weirdSequence(int n, int lastIndex, int lastTerm) {
        if (lastIndex < n) {
            System.out.println(lastTerm + lastIndex);
            weirdSequence(n, lastIndex + 1, lastTerm + lastIndex);
        }
    }

    public static int anotherWay(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }
        else {
            int x = anotherWay(n-1) + n-1;
            System.out.println(x);
            return x;
        }
    }

    public static void main(String[] args) {
        anotherWay(7);
    }
}
