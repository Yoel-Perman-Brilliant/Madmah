package universal;


public class Main {
    public static Node<Integer> getNthNode(Node<Integer> list, int n) {
        if (n == 1)
            return list;
        else
            return getNthNode(list, n - 1).getNext();
    }

    public static Integer getNthValue(Node<Integer> list, int n) {
        return getNthNode(list, n).getValue();
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 9, 2, 1, 15, 3, 6, 20, 2, 1, 23};
        Node<Integer> list1 = LinkedListUtil.getInstance().listFromArray(arr);
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(getNthValue(list1, i));
        }
        System.out.println(list1);
    }
}
