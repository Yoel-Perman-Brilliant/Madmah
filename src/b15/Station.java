package b15;

public class Station {

    private int x;
    private int y;

    public Station(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Station other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
    }
}
