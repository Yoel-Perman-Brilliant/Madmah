package page27;

public class Q15 {
    public static int numOfPositivies(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        int output = numOfPositivies(arr, index+1);
        if (arr[index] > 0)
            output+=1;
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1, -5, 6, 8, -4};
        System.out.println(numOfPositivies(arr,0));

    }
}
