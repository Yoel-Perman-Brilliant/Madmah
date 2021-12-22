package universal;

public class LinkedListUtil<T> {
    private Node<T> list;
    private static LinkedListUtil instance = new LinkedListUtil(null);

    private LinkedListUtil(Node<T> list) {
        this.list = list;
    }

    private void insert(Node<T> newNode) {
        Node<T> p = list;
        if (p == null) {
            list = newNode;
            p = newNode;
        } else {
            while (p.hasNext()) {
                p = p.getNext();
            }
            p.setNext(newNode);
        }
    }

    public Node<T> listFromArray(T[] arr) {
        Node<T> pos;
        for (int i = 0; i < arr.length; i++) {
            pos = new Node<T>(arr[i]);
            instance.insert(pos);
        }
        Node<T> output = instance.list;
        instance.list = null;
        return output;
    }

    public static LinkedListUtil getInstance() {
        return instance;
    }
}