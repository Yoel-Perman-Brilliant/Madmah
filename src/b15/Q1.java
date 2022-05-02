package b15;

import universal.BinNode;

public class Q1 {
    //i F
    //ii T
    //iii T

    public static boolean booleanExpression(BinNode<String> tree) {
        if (tree.getValue().equals("F"))
            return false;
        if (tree.getValue().equals("T"))
            return true;
        if (tree.getValue().equals("AND"))
            return booleanExpression(tree.getLeft()) && booleanExpression(tree.getRight());
        if (tree.getValue().equals("OR"))
            return booleanExpression(tree.getLeft()) || booleanExpression(tree.getRight());
        throw new IllegalArgumentException("illegal tree");
    }

    public static void main(String[] args) {
        BinNode<String> left = new BinNode<>(
                new BinNode<>("F"),
                "OR",
                new BinNode<>("T")
        );
        BinNode<String> root = new BinNode<>(
                left,
                "AND",
                new BinNode<>("T")
        );
        System.out.println(booleanExpression(root));
    }
}
