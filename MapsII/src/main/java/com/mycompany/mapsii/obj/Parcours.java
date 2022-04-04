package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;

import java.util.List;

public class Parcours {
    private TransportEnum[] transports = {
        TransportEnum.Bicycle,
        TransportEnum.Bus,
        TransportEnum.Car,
        TransportEnum.Metro,
        TransportEnum.Taxi
    };

    private List<Trajet> trajets;

    public Parcours(List<Location> locations) {
        for (TransportEnum transport: transports) {
            trajets.add(new Trajet(locations, transport));
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
