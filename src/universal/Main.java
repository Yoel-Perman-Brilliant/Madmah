package universal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int num1 = new Scanner(System.in).nextInt();
            int num2 = num1 > 2 ? -6 : -9;
            System.out.println(num2);
        }
    }
}
