package b15;

public class Program {

    public static void main(String[] args) {
        BusRoute route = new BusRoute(new Station(1, 2), new Station(1, 4));
        route.addStation(new Station(5, 4));
        route.addStation(new Station(3, 1));
        route.addStation(new Station(5, 0));
        System.out.println(route.routeLength());
    }
}
