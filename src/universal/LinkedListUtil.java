package universal;

public class LinkedListUtil {
    public static <T> Node<T> listFromArray(T[] arr, int i) {
        if (i >= arr.length)
            return null;
        return new Node<T>(arr[i], listFromArray(arr, i+1));
    }

    public static <T> Node<T> listFromArray(T[] arr) {
        return listFromArray(arr, 0);
    }
}


