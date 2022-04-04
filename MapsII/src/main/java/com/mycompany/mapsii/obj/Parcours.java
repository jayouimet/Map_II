package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;

import java.util.List;
import java.util.Map;

public class Parcours {
    private TransportEnum[] transports = {
        TransportEnum.Bicycle,
        TransportEnum.Bus,
        TransportEnum.Car,
        TransportEnum.Metro,
        TransportEnum.Taxi
    };

    private Map<TransportEnum, Trajet> trajets;

    public Parcours(List<Location> locations) {
        for (TransportEnum transport: transports) {
            trajets.put(transport, new Trajet(locations, transport));
        }
    }

    public Map<TransportEnum, Trajet> getTrajets() {
        return trajets;
    }

    public Map.Entry<TransportEnum, Trajet> getBest() {
        Map.Entry<TransportEnum, Trajet> bestTrajet = null;

        for (Map.Entry<TransportEnum, Trajet> entry: trajets.entrySet()) {
            if (bestTrajet == null || entry.getValue().calculateScore() > bestTrajet.getValue().calculateScore()) {
                bestTrajet = entry;
            }
        }

        return bestTrajet;
    }
}
