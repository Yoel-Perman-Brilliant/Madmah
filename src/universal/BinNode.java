package universal;

public class BinNode<T> {
    private BinNode<T> left;
    private T value;
    private BinNode<T> right;

    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }


    //inner
    public String buildString() {
        String output = value.toString() + ",";
        if (hasLeft())
            output += left.buildString();
        if (hasRight())
            output += right.buildString();
        return output;
    }

    public String toString() {
        return "[" + buildString().substring(0, buildString().length() - 1) + "]";
    }
}
