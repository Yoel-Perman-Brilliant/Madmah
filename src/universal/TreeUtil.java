package universal;

public class TreeUtil {

    public interface IntegerTree {
        BinNode<Integer> left = new BinNode<>(6);
        BinNode<Integer> right = new BinNode<>(new BinNode<>(2), 4, null);
        BinNode<Integer> root = new BinNode<>(left, 3, right);
    }

    public interface CharacterTree {
        BinNode<Character> leftLeft = new BinNode<>(null, 'f', new BinNode<>('s'));
        BinNode<Character> right = new BinNode<>(new BinNode<>('s'), 't', new BinNode<>('k'));
        BinNode<Character> left = new BinNode<>(leftLeft, 'p', null);
        BinNode<Character> root = new BinNode<>(left, 'x', right);
    }

    private TreeUtil() {
    }

    public static <T> boolean isLeaf(BinNode<T> tree) {
        if (tree == null)
            return false;
        return !tree.hasLeft() && !tree.hasRight();
    }

    public static <T> int numberOfLeaves(BinNode<T> t) {
        if (t == null)
            return 0;
        if (isLeaf(t))
            return 1;
        return numberOfLeaves(t.getLeft()) + numberOfLeaves(t.getRight());
    }

    public static <T> boolean exists(BinNode<T> tree, T value) {
        if (tree == null)
            return false;
        return tree.getValue().equals(value) || exists(tree.getLeft(), value) || exists(tree.getRight(), value);
    }
}
