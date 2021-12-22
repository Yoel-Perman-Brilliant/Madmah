package universal;

import java.util.function.Supplier;

public class Main {
    public static void fix(Node<Integer> list) {
        while (list.hasNext() && list != null) {
            if (list.getValue() >= list.getNext().getValue()) {
                list.setNext(list.getNext().getNext());
            } else {
                list = list.getNext();
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 9, 2, 1, 15, 3, 6, 20, 2, 1, 23};
        Node<Integer> list1 = LinkedListUtil.getInstance().listFromArray(arr);
        fix(list1);
        System.out.println(list1);
    }
}
