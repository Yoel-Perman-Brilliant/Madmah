package Universal;

public class LinkedListUtil<T> {
    private Node<T> list;
    private static final LinkedListUtil INSTANCE = new LinkedListUtil(null);
    private LinkedListUtil(Node<T> list){
        this.list = list;
    }
    private void insert(Node<T> newNode){
        Node<T> p = INSTANCE.list;
        if (p==null){
            list = newNode;
            p = newNode;
        }
        else {
            while (p.hasNext()) {
                p = p.getNext();
            }
            p.setNext(newNode);
        }
    }
    public Node<T> listFromArray(T[] arr){
        Node<T> pos;
        for(int i=0; i<arr.length; i++){
            pos = new Node<T>(arr[i]);
            INSTANCE.insert(pos);
        }
        Node<T> output = INSTANCE.list;
        INSTANCE.list = null;
        return output;
    }
    public static LinkedListUtil getInstance(){
        return INSTANCE;
    }
}