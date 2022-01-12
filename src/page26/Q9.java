package page26;

public class Q9 {
    public static boolean allSame(int n) {
        if (n < 10)
            return true;
        if (n%2 != (n/10)%2)
            return false;
        else
            return allSame(n/10);
    }

    public static void main(String[] args) {
        System.out.println(allSame(6848));
    }
}
