package b20;

public class Q3Hostel {

    private Q3Room[] allRooms;

    public int orderRoom(int type, int nights) {
        for (int i = 0; i < allRooms.length; i++) {
            Q3Room room = allRooms[i];
            if (room.getRoomType() == type && room.getNightsReserved() == 0) {
                room.setNightsReserved(nights);
                return room.getRoomNum();
            }
        }
        return -1;
    }

    public int[] floorIncome() {
       int[] incomes = {0, 0, 0};
       for (int i = 0; i < allRooms.length; i++) {
           incomes[allRooms[i].getRoomNum()/100 - 1] += allRooms[i].income();
       }
       return incomes;
    }
}
