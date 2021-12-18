package Universal;

public class Main {
    public static void main(String[] args){
        Integer[] arr = {1,5,7,8};
        Node<Integer> node = LinkedListUtil.getInstance().listFromArray(arr);
        System.out.println(node);
        Integer[] arr2 = {1,9,76};
        System.out.println(LinkedListUtil.getInstance().listFromArray(arr2));
        Character[] arr3 = {'a', 'b', '8'};
        System.out.println(LinkedListUtil.getInstance().listFromArray(arr3));
    }
}
