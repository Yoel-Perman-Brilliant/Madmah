package b21_2;

public class Q2 {

    public static Q2PairOfNums[] generate(int n) {
        Q2PairOfNums[] arr = new Q2PairOfNums[n];
        for (int i = 0; i < n; i++) {
            Q2PairOfNums pair = new Q2PairOfNums(getRandom(), getRandom());
            while (!pair.endStart()) {
                pair = new Q2PairOfNums(getRandom(), getRandom());
            }
            arr[i] = pair;
        }
        return arr;
    }

    public static int getRandom() {
        return (int)(Math.random()*1001) + 1;
    }
}
