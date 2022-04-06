package com.mycompany.mapsii.obj;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private Parcours parcours;

    public Engine(List<Location> locations) {
        parcours = new Parcours(locations);
    }

    public Parcours getParcours() {
        return parcours;
    }
}
