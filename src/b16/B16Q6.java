package b16;

import universal.BinNode;
import universal.TreeUtil;

public class B16Q6 {

    public static boolean upPath(BinNode<Integer> tr) {
        if (TreeUtil.isLeaf(tr))
            return true;
        return
                (tr.hasLeft() && tr.getLeft().getValue() > tr.getValue() && upPath(tr.getLeft()))
                || (tr.hasRight() && tr.getRight().getValue() > tr.getValue() && upPath(tr.getRight()));
    }

    public static void main(String[] args) {
        System.out.println(upPath(TreeUtil.IntegerTree.right));
    }
}
