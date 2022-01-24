package page27;

public class Q16 {
    //start currentIndex at 0
    public static int indexInArray(int[] arr, int num, int currentIndex) {
        if (currentIndex >= arr.length)
            return -1;
        if (arr[currentIndex] == num)
            return currentIndex;
        return indexInArray(arr, num, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, -5, 6, 8, -4};
        System.out.println(indexInArray(arr, 8, 0));
    }
}
