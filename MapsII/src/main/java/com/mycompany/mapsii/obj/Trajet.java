package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;

import java.util.List;

public class Trajet {
    private List<Section> sections;

    public Trajet (List<Location> locations, TransportEnum transport) {
        if (locations.size() == 0) return;

        Location previousLoc = locations.get(0);

        for (int i = 1; i < locations.size(); i++) {
            sections.add(new Section(previousLoc.getDistance(locations.get(i)), transport));
        }
    }

    public double calculatePrice() {
        double price = 0;

        for (Section s: sections) {
            price += s.getPrice();
        }

        return price;
    }

    public double calculateCarbonEmission() {
        double carbonEmission = 0;

        for (Section s: sections) {
            carbonEmission += s.getCarbonEmission();
        }

        return carbonEmission;
    }

    public int calculateDuration() {
        int duration = 0;

        for (Section s: sections) {
            duration += s.getDuration();
        }

        return duration;
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
