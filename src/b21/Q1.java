package b21;

public class Q1 {

    public static int filterSize(int[] arr, int num) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num)
                size++;
        }
        return size;
    }

    public static int[] filter(int[] arr, int num) {
        int[] filtered = new int[filterSize(arr, num)];
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                filtered[current] = arr[i];
                current++;
            }
        }
        return filtered;
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 2, 9, 4, -3};
        arr = filter(arr, 9);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
