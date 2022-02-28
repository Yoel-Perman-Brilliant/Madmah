package d2_2_22;

import universal.BinNode;
import universal.TreeUtil;

public class Exs {
    public static int recursiveSum(BinNode<Integer> tree) {
        if (TreeUtil.isLeaf(tree))
            return tree.getValue();
        return tree.getValue() + recursiveSum(tree.getLeft()) + recursiveSum(tree.getRight());
    }

    public static void main(String[] args) {
        BinNode<Integer> five = new BinNode<>(5);
        BinNode<Integer> four = new BinNode<>(null, 4, five);
        BinNode<Integer> seven = new BinNode<>(7);
        BinNode<Integer> three = new BinNode<>(four, 3, seven);

    }
}
