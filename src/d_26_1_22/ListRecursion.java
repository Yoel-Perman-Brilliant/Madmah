package d_26_1_22;

import universal.LinkedListUtil;
import universal.Node;

public class ListRecursion {
    public static int sumFromNode(Node<Integer> list) {
        if (list == null)
            return 0;
        return list.getValue() + sumFromNode(list.getNext());
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 8, 3, 8};
        Node<Integer> list = LinkedListUtil.listFromArray(arr);
        System.out.println(sumFromNode(list.getNext()));
    }
}
