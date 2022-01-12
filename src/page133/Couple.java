package page133;

class Couple {
    private double num;
    private int appears;

    public Couple(double num, int appears) {
        this.num = num;
        this.appears = appears;
    }

    public Couple(double[] arr) {
        this(arr[0], (int) arr[1]);
    }

    public double getNum() {
        return num;
    }

    public int getAppears() {
        return appears;
    }

    public String toString() {
        return "[" + num + ", " + appears + "]";
    }
}
