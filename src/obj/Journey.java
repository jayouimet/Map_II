package obj;

import java.util.ArrayList;

public class Journey {
    private ArrayList<Route> routes = new ArrayList<Route>();

    public Route getRoute(int index){ return routes.get(index); }
}
