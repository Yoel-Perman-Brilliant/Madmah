package hw13_2_22;

import universal.LinkedListUtil;
import universal.Node;

public class ProductList {
    /**
     * complexity order of magnitude: O(n^2)
     */
    public static Node<Double> productList(Node<Double> list1, Node<Double> list2) {
        Node<Double> output = null;
        double sum = listSum(list2);
        while (list2 != null) {
            output = LinkedListUtil.addAtEnd(output, new Node<>(list2.getValue()*sum));
            list2 = list2.getNext();
        }
        return output;
    }

    public static double listSum(Node<Double> list) {
        double sum = 0;
        while (list != null) {
            sum += list.getValue();
            list = list.getNext();
        }
        return sum;
    }

    public static void main(String[] args) {
        Double[] arr1 = {1.0, 2.0, 4.0};
        Node<Double> list1 = LinkedListUtil.listFromArray(arr1);
        Double[] arr2 = {5.0, 6.0, 3.0, 2.0};
        Node<Double> list2 = LinkedListUtil.listFromArray(arr2);
        System.out.println(productList(list1, list2));
    }
}
