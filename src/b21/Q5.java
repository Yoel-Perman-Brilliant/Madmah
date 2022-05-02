package b21;

import universal.LinkedListUtil;
import universal.Node;

public class Q5 {

    public static Node<Integer> move(Node<Integer> lst, int n) {
        if (n == 0)
            return lst;
        Node<Integer> p = lst;
        int placement = LinkedListUtil.length(lst) - n - 1;
        for (int i = 0; i < placement; i++)
            p = p.getNext();
        Node<Integer> last = p;
        Node<Integer> start = p.getNext();
        while (p.hasNext()) {
            p = p.getNext();
        }
        last.setNext(null);
        p.setNext(lst);
        return start;
    }

    public static void main(String[] args) {
        Node<Integer> lst = LinkedListUtil.listFromArray(new Integer[]{5, 1, 2, 8, 4});
        lst = move(lst, 0);
        System.out.println(lst);
    }
}
