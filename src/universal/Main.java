package universal;

public class Main {
    public static <T> Node<T> listFromArray(T[] arr, int i) {
        if (i >= arr.length)
            return null;
        return new Node<T>(arr[i], listFromArray(arr, i+1));
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 6, 3, 5};
        System.out.println(listFromArray(arr, 0));
    }


}