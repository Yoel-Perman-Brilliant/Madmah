package b21;

import universal.LinkedListUtil;
import universal.Node;

public class BiList {

    private Node<Integer> lst1;
    private Node<Integer> lst2;

    public BiList() {
        lst2 = null;
        lst1 = null;
    }

    public void addNum(int num, int codeList) {
        switch (codeList) {
            case 1 -> lst1 = LinkedListUtil.addAtEnd(lst1, new Node<>(num));
            case 2 -> lst2 = LinkedListUtil.addAtEnd(lst2, new Node<>(num));
        }
    }

    public void addNum2(int num, int codeList) {
        switch (codeList) {
            case 1 -> lst1 = new Node<>(num, lst1);
            case 2 -> lst2 = new Node<>(num, lst2);
        }
    }

    @Override
    public String toString() {
        return lst1.toString() + "\n" + lst2.toString();
    }
}
