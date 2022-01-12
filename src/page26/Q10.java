package page26;

public class Q10 {
    public static int weirdSumThing(int n) {
        if (n == 0)
            return 0;
        if (n%2 == 0)
            return weirdSumThing(n-1) + n*n;
        else
            return weirdSumThing(n-1) + n*2;
    }

    public static void main(String[] args) {
        System.out.println(weirdSumThing(5));
    }
}
