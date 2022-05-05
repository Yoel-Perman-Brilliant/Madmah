package b20;

import universal.Node;

public class Q5Race {

    private Node<Q5Competitor> competitors;

    public void add(Q5Competitor x) {
        Node<Q5Competitor> p = competitors;
        while (p.hasNext() && getTotalSeconds(p.getNext().getValue()) < getTotalSeconds(x)) {
            p = p.getNext();
        }
        p.setNext(new Node<>(x, p.getNext()));
    }

    public String rank(int x) {
        Node<Q5Competitor> p = competitors;
        for (int i = 0; i < x - 1; i++) {
            p = p.getNext();
        }
        return p.getValue().getName();
    }

    public static int getTotalSeconds(Q5Competitor competitor) {
        return 60 * competitor.getMinutes() + competitor.getSeconds();
    }
}
