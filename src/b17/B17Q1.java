package b17;

public class B17Q1 {
    public static int big(int[] arr) {
        if (arr.length == 0)
            return 0;
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(big(arr));

    }
}
