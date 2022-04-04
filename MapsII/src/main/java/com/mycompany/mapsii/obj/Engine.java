package com.mycompany.mapsii.obj;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private List<Location> locations;
    private Parcours parcours;

    public Engine() {
        locations = new ArrayList<>();
        locations.add(new Location("Maison", 45.866094, -74.0527048));
        locations.add(new Location("Travail", 45.4919109, -73.6164942));
        locations.add(new Location("Université", 45.7748878, -74.0034434));
        locations.add(new Location("Cinéma", 45.7948927, -74.0188427));
        locations.add(new Location("Aéroport", 45.4542236, -73.7472437));
        locations.add(new Location("Costco", 45.7655006, -74.0182878));
        locations.add(new Location("Dépanneur", 45.7611145, -74.0235132));
        locations.add(new Location("Bibliothèque", 45.778799, -74.0031385));
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void generateParcours(List<Location> locations) {
        parcours = new Parcours(locations);
    }

    public Parcours getParcours() {
        return parcours;
    }
}
