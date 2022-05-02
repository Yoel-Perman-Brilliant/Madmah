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

    public static <T> int length(Node<T> list) {
        int length = 0;
        while (list != null) {
            length++;
            list = list.getNext();
        }
        return length;
    }

    public static Node<Integer> delete(int unwantedValue, Node<Integer> list) {
        Node<Integer> start = list;
        while (start.getValue() == unwantedValue) {
            start = start.getNext();
            list = start;
        }
        while (list.hasNext()) {
            if (list.getNext().getValue() == unwantedValue)
                list.setNext(list.getNext().getNext());
            else
                list = list.getNext();
        }
        return start;
    }

    public static int min(Node<Integer> list) {
        int min = list.getValue();
        while (list != null) {
            min = Math.min(list.getValue(), min);
            list = list.getNext();
        }
        return min;
    }

    public static int max(Node<Integer> list) {
        int max = list.getValue();
        while (list != null) {
            max = Math.max(list.getValue(), max);
            list = list.getNext();
        }
        return max;
    }

    public static <T> Node<T> reverse(Node<T> list) {
        Node<T> reverse = null;
        while (list != null) {
            reverse = new Node<>(list.getValue(), reverse);
            list = list.getNext();
        }
        return reverse;
    }
}
