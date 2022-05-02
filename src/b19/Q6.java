package b19;

import universal.BinNode;

public class Q6 {

    public boolean order(BinNode<Range> tree) {
        if (tree == null)
            return true;

        boolean leftCondition = tree.getValue().getLow() == tree.getLeft().getValue().getLow() &&
                tree.getValue().getHigh() >= tree.getLeft().getValue().getHigh();

        boolean rightCondition = tree.getValue().getHigh() == tree.getRight().getValue().getHigh() &&
                tree.getValue().getLow() <= tree.getRight().getValue().getLow();

        boolean bothCondition = tree.getLeft().getValue().getHigh() < tree.getRight().getValue().getLow();

        if (tree.hasLeft() && !leftCondition)
            return false;

        if (tree.hasRight() && !rightCondition)
            return false;

        if (tree.hasLeft() && tree.hasRight() && !bothCondition)
            return false;

        return order(tree.getLeft()) && order(tree.getRight());
    }
}
