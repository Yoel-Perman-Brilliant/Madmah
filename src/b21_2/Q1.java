package b21_2;

public class Q1 {

    public static boolean isDouble(String str) {
        int length = str.length();
        String part1 = str.substring(0, length/2);
        String part2 = str.substring(length/2, length);
        return part1.equals(part2);
    }

    public static void main(String[] args) {
        System.out.println(isDouble("**"));
        System.out.println(isDouble("a@a@"));
        System.out.println(isDouble("abcabc"));
        System.out.println(isDouble("%"));
        System.out.println(isDouble("ab"));
        System.out.println(isDouble("a@a"));
        System.out.println(isDouble("abba"));
        System.out.println(isDouble("ab&ab"));
        System.out.println(isDouble("232323"));
    }
}
