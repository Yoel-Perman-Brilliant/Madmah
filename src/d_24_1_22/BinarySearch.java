package d_24_1_22;

public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int num) {
        int mid = (int)(Math.ceil((start+end)/2.0));
        if (mid <= 0)
            return -1;
        if (num == arr[mid])
            return mid;
        if (num > arr[mid])
            return binarySearch(arr, mid, end, num);
        else
            return binarySearch(arr, start, mid, num);
    }

    public static void main(String[] args) {
        int arr[] = {3, 8, 10, 12, 15, 20, 24, 30};
        System.out.println(binarySearch(arr, 0, arr.length, 15));
    }
}
