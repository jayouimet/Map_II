package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;
import com.mycompany.mapsii.obj.Enums.VariableEnum;
import java.util.ArrayList;

import java.util.List;

public class Trajet {
    private List<Section> sections;
    private double score;

    public Trajet (List<Location> locations, TransportEnum transport) {
        if (locations.size() == 0) return;

        Location previousLoc = locations.get(0);

        sections = new ArrayList<Section>();

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

    public double calculateScore() {
        VariableEnum v = Preference.getInstance().getImportantVariable();
        double generalScore = 0;
        float multEmission = 1f;
        float multDuration = 1f;
        float multCost = 1f;

        switch (v){
            case Emission -> multEmission = 2f;
            case Duration -> multDuration = 3f;
            case Cost -> multCost = 2f;
        }

        for(Section s : sections){
            generalScore += (multEmission * 100 / (s.getCarbonEmission() / (100*s.getDistance()) + 1f));
            generalScore += (multDuration * 100 / (s.getDuration() / (200*s.getDistance()) + 1f));
            generalScore += (multCost * 100 / (s.getPrice() * 10/(30 + s.getDistance()) + 1f));
        }

        score = generalScore;
        return generalScore;
    }

    public double getScore(){return score;}
    public void setScore(double s){score = s;}

    public double getDistance() {
        double dist = 0;

        for (Section s: sections) {
            dist += s.getDistance();
        }

        return dist;
    }
}
