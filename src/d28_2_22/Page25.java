package d28_2_22;

import com.sun.source.tree.Tree;
import universal.BinNode;
import universal.TreeUtil;

public class Page25 {

    public static boolean isEitherDescendant(BinNode<Character> t, char c1, char c2) {
        return isOffspring(t, c1, c2) || isOffspring(t, c2, c1);
    }

    public static boolean isOffspring(BinNode<Character> tree, char c1, char c2) {
        if (tree == null)
            return false;
        if (tree.getValue() == c1 && TreeUtil.exists(tree, c2))
            return true;
        return isOffspring(tree.getLeft(), c1, c2) || isOffspring(tree.getRight(), c1, c2);
    }
}
