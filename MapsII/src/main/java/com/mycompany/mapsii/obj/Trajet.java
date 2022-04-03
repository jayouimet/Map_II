package com.mycompany.mapsii.obj;

import java.util.List;

public class Trajet {
    private List<Section> sections;

    public Trajet (List<Location> locations, Class transport) {
        if (locations.size() == 0) return;

        Location previousLoc = locations.get(0);

        for (int i = 1; i < locations.size(); i++) {
            sections.add(new Section(previousLoc.getDistance(locations.get(i)), transport));
        }
    }

    public double calculatePrice() {
        return 10.00;
    }

    public double calculateCarbonEmission() {
        return 100;
    }

    public int calculateDuration() {
        return 3600;
    }

    public int calculateScore() {
        return 100;
    }

    public double getDistance() {
        double dist = 0;
        for (Section s: sections) {
            dist += s.getDistance();
        }
        return dist;
    }
}
