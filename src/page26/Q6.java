package page26;

public class Q6 {
    public static int remainment(int n1, int n2) {
        if (n1 <= n2)
            return n1;
        else
            return remainment(n1-n2, n2);
    }

    public static void main(String[] args) {
        System.out.println(remainment(19, 4));
    }
}
