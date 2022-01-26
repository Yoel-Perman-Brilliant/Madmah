package page98;

import universal.Node;

public class Q46 {
    public static int lengthDifference(Node<Integer> list1, Node<Integer> list2) {
        if (list1 == null && list2 == null)
            return 0;
        else if (list1 == null && list2 != null)
            return lengthDifference(null, list2.getNext()) + 1;
        else if (list1 != null && list2 == null)
            return lengthDifference(list1.getNext(), null) + 1;
        else
            return lengthDifference(list1.getNext(), list2.getNext());
    }

    public static void main(String[] args) {

    }
}
