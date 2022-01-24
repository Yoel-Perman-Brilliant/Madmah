package page27;

public class Q17 {
    //start currentIndex at 0
    public static boolean isIncreasing(int[] arr, int currentIndex) {
        if (currentIndex >= arr.length - 1)
            return true;
        return arr[currentIndex] <= arr[currentIndex+1] && isIncreasing(arr, currentIndex+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 7, 9};
        System.out.println(isIncreasing(arr, 0));
    }
}
