package b21;

import universal.LinkedListUtil;
import universal.Node;

public class Q4 {

    public static BiList generateBiList(Node<Integer> lst) {
        int length = LinkedListUtil.length(lst);
        BiList output = new BiList();
        int max;
        for (int i =0; i < length/2; i++) {
            max = LinkedListUtil.max(lst);
            output.addNum(max, 1);
            lst = LinkedListUtil.delete(max, lst);
        }
        while (lst != null) {
            output.addNum(lst.getValue(), 2);
            lst = lst.getNext();
        }
        return output;
    }

    public static void main(String[] args) {
        Node<Integer> list = LinkedListUtil.listFromArray(new Integer[]{1, 6, 8, 3, 7, 4, 2, 9});
        System.out.println(generateBiList(list));
    }
}
