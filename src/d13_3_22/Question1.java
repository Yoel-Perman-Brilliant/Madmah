package d13_3_22;

import universal.BinNode;
import universal.TreeUtil;

public class Question1 {

    public static int equalTriangles(BinNode<Integer> tree) {
        if (TreeUtil.isLeaf(tree))
            return 0;
        if (tree.getValue() == tree.getLeft().getValue() && tree.getValue() == tree.getRight().getValue()) {
            return 1 + equalTriangles(tree.getLeft()) + equalTriangles(tree.getRight());
        }
        return equalTriangles(tree.getLeft()) + equalTriangles(tree.getRight());
    }

    public static void printPerimeters(BinNode<Integer> tree) {
        if (tree != null) {
            System.out.println(tree.getValue() + tree.getLeft().getValue() + tree.getRight().getValue());
            printPerimeters(tree.getLeft());
            printPerimeters(tree.getRight());
        }
    }
}
