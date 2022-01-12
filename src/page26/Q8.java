package page26;

public class Q8 {
    //The question said you can add parameters. Make sure to start off with current = (int)Math.sqrt(n).
    public static boolean isPrime(int n, int current) {
        if (current == 1)
            return true;
        if (n%current == 0)
            return false;
        return isPrime(n, current-1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(19, (int)Math.sqrt(19)));
    }
}
