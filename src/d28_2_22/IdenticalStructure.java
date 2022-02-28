package d28_2_22;

import universal.BinNode;
import universal.TreeUtil;

public class IdenticalStructure {

    public static <T, S> boolean identicalStructure(BinNode<T> tree1, BinNode<S> tree2) {
        if (tree1 == null && tree2 == null)
            return true;
        if (tree1 == null || tree2 == null)
            return false;
        return identicalStructure(tree1.getLeft(), tree2.getLeft())
                && identicalStructure(tree1.getRight(), tree2.getRight());
    }

    public static void main(String[] args) {
        System.out.println(identicalStructure(TreeUtil.CharacterTree.root, TreeUtil.IntegerTree.root));
    }
}
