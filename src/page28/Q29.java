package page28;

public class Q29 {
    public static void weirdSequence(int n, int lastIndex, int lastTerm) {
       if (lastIndex < n) {
           System.out.println(lastTerm + lastIndex);
           weirdSequence(n, lastIndex + 1, lastTerm + lastIndex);
       }
    }

    public static void main(String[] args) {
        weirdSequence(7, 0, 1);
    }
}
