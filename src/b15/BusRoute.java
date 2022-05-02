package b15;

import universal.LinkedListUtil;
import universal.Node;

public class BusRoute {

    /**
     * A linked-list of stations, which acts as the route
     */
    private Node<Station> route;

    public BusRoute(Station first, Station second) {
        this.route = new Node<>(first, new Node<>(second));
    }

    public void addStation(Station newStation) {
        LinkedListUtil.addAtEnd(route, new Node<>(newStation));
    }

    public double routeLength() {
        double sum = 0;
        Node<Station> stations = route;
        while (stations.hasNext()) {
            sum += stations.getValue().distance(stations.getNext().getValue());
            stations = stations.getNext();
        }
        return sum;
    }
}
