package b21_2;

import universal.LinkedListUtil;
import universal.Node;

public class Q5 {

    public static boolean isPrefix(Node<Integer> lst1, Node<Integer> lst2) {
        while (lst1 != null) {
            if (lst2 == null)
                return false;
            if (lst1.getValue() != lst2.getValue())
                return false;
            lst1 = lst1.getNext();
            lst2 = lst2.getNext();
        }
        return true;
    }

    public static boolean isSubChain(Node<Integer> lst1, Node<Integer> lst2) {
        while (lst2 != null) {
            if (isPrefix(lst1, lst2))
                return true;
            lst2 = lst2.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        Node<Integer> list1 = LinkedListUtil.listFromArray(new Integer[]{3, 2, 4, 7});
        Node<Integer> list2 = LinkedListUtil.listFromArray(new Integer[]{9, 3, 3, 2, 4, 8, 9});
        System.out.println(isSubChain(list1, list2));
    }

}
