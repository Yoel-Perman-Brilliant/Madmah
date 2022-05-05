package b21_2;

import universal.LinkedListUtil;
import universal.Node;

public class Q4 {

    public static boolean isArranged(Node<Integer> lst) {
        int length = LinkedListUtil.length(lst);
        if (length % 2 != 0)
            return false;
        int firstHalfMax = partialMax(lst, length/2);
        for (int i = 0; i < length/2; i++) {
            lst = lst.getNext();
        }
        int secondHalfMin = partialMin(lst, length/2);
        return firstHalfMax < secondHalfMin;

    }

    public static int partialMax(Node<Integer> list, int length) {
        int max = list.getValue();
        for (int i = 0; i < length; i++) {
            max = Math.max(max, list.getValue());
            list = list.getNext();
        }
        return max;
    }

    public static int partialMin(Node<Integer> list, int length) {
        int min = list.getValue();
        for (int i = 0; i < length; i++) {
            min = Math.min(min, list.getValue());
            list = list.getNext();
        }
        return min;
    }

    public static void main(String[] args) {
        Node<Integer> list = LinkedListUtil.listFromArray(new Integer[]{3, -4, 9, 7, 7, 15, 9});
        System.out.println(isArranged(list));
    }

    /*
      Since length() goes over the entire list and only performs basic actions, it has a complexity of O(n).
      partialMax() and partialMin() both go over half the list and perform basic actions, so they have a complexity of
      O(n).
      isArranged() includes length(), then partialMax(), then goes over half the list, then partialMin(). All of those
      actions have a complexity of O(n), and all the other actions in isArranged() are basic.
      As a result, the complexity of isArranged is O(n) + O(n) + O(n) + O(n) = O(n).
     */


}
