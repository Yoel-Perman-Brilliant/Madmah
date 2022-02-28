package universal;

public final class LinkedListUtil {

    private LinkedListUtil() {
    }

    public static <T> Node<T> listFromArray(T[] arr, int i) {
        if (i >= arr.length)
            return null;
        return new Node<T>(arr[i], listFromArray(arr, i + 1));
    }

    public static <T> Node<T> listFromArray(T[] arr) {
        return listFromArray(arr, 0);
    }

    public static <T> Node<T> addAtEnd(Node<T> list, Node<T> end) {
        if (list == null)
            return end;
        Node<T> p = list;
        while (p.hasNext())
            p = p.getNext();
        p.setNext(end);
        return list;
    }
}


