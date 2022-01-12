package universal;

public class Main {
    public static Node<Integer> copy(Node<Integer> list) {
        Node<Integer> output = null;
        while (list != null) {
            output = addAtEnd(output, new Node<Integer>(list.getValue()));
            list = list.getNext();
        }
        return output;
    }



    public static Node<Integer> addAtEnd(Node<Integer> list, Node<Integer> end) {
        if (list == null)
            return end;
        else {
            Node<Integer> p = list;
            while (p.hasNext())
                p = p.getNext();
            p.setNext(end);
            return list;
        }
    }


}