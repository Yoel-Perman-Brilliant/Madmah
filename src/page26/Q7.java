package page26;

import java.io.OutputStream;

public class Q7 {
    public static boolean isAMultiple(int x, int y) {
        if (x <= y)
            return x==y;
        else
            return isAMultiple(x-y, y);
    }

    public static void main(String[] args) {
        System.out.println(isAMultiple(100, 5));
    }
}
