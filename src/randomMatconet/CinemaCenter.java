package randomMatconet;

public class CinemaCenter {

    Kupa[] arr = new Kupa[10];

    public int countFull() {
        int output = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i].getState() && arr[i].getTickets() < arr[i].getNumInLine()) {
                output++;
            }
        }
        return output;
    }
}
