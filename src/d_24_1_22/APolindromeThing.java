package d_24_1_22;

public class APolindromeThing {

    /**
     * write a recursive method which gets as parameters an array of little letters and 2 indexes. The method
     * should check whether the content of the array is a palindrome.
     */
    public static boolean isAPolindrome(char[] arr, int startIndex, int endIndex) {
        if (endIndex <= startIndex)
            return true;
        if (arr[startIndex] != arr[endIndex])
            return false;
        return isAPolindrome(arr, startIndex+1, endIndex-1);
    }

    public static void main(String[] args) {
        char[] arr = {'a'};
        System.out.println(isAPolindrome(arr, 0, arr.length-1));
    }

}
