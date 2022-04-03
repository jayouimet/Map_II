package com.mycompany.mapsii.obj;

import java.util.ArrayList;
import java.util.List;

public class Parcours {
    private Class[] transports = { Bicycle.class, Walk.class, Bus.class, Metro.class, Taxi.class, Car.class };

    private List<Trajet> trajets;

    public Parcours(List<Location> locations) {
        for (Class transportClass: transports) {
            trajets.add(new Trajet(locations, transportClass));
        }
    }

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public Trajet getBest() {
        Trajet bestTrajet = null;

        for (Trajet t: trajets) {
            if (bestTrajet == null || t.calculateScore() > bestTrajet.calculateScore()) {
                bestTrajet = t;
            }
        }

        return bestTrajet;
    }
}
