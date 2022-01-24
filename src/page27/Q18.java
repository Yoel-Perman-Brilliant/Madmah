package page27;

import page26.Q8;

public class Q18 {
    public static boolean noPrimes(int[] arr, int i) {
        if (i>= arr.length)
            return true;
        if (Q8.isPrime(arr[i], (int)(Math.sqrt(arr[i]))))
            return false;
        return noPrimes(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 9};
        System.out.println(noPrimes(arr, 0));
    }
}
