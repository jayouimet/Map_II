package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;
import com.mycompany.mapsii.obj.Enums.VariableEnum;
import java.util.ArrayList;

import java.util.List;

// Le trajet pour un certain véhicule
public class Trajet {
    // La liste de sections dans le trajet
    private List<Section> sections;
    // Le score du trajet
    private double score;

    /**
     * Constructeur du trajet
     * @param locations La liste de locations
     * @param transport Le transport utilisé
     */
    public Trajet (List<Location> locations, TransportEnum transport) {
        if (locations.size() == 0) return;
        // Création des sections à partir des locations
        Location previousLoc = locations.get(0);

        sections = new ArrayList<Section>();

        for (int i = 1; i < locations.size(); i++) {
            sections.add(new Section(previousLoc.getDistance(locations.get(i)), transport));
        }
    }

    /**
     * Calculs le prix du trajet
     * @return Retourne le prix en dollars
     */
    public double calculatePrice() {
        double price = 0;

        // Pour chaque section on additione le prix
        for (Section s: sections) {
            price += s.getPrice();
        }

        return price;
    }

    /**
     * Calculs l'émission de carbone du trajet
     * @return Retourne l'émission en kg de CO2
     */
    public double calculateCarbonEmission() {
        double carbonEmission = 0;

        // Pour chaque section on additione l'émission
        for (Section s: sections) {
            carbonEmission += s.getCarbonEmission();
        }

        return carbonEmission;
    }

    /**
     * Calculs la durée du trajet
     * @return Retourne la durée du trajet en secondes
     */
    public int calculateDuration() {
        int duration = 0;

        // Pour chaque section on additione la durée
        for (Section s: sections) {
            duration += s.getDuration();
        }

        return duration;
    }

    /**
     * Permet de calculer le score individuel du trajet.
     * @return Le score
     */
    public double calculateScore() {
        // Initialisation des variables, normalement a 1.
        VariableEnum v = Preference.getInstance().getImportantVariable();
        double generalScore = 0;
        float multEmission = 1f;
        float multDuration = 1f;
        float multCost = 1f;

        // Change le multiplicateur de la variable dominante choisi en preference
        switch (v){
            case Emission -> multEmission = 2f;
            case Duration -> multDuration = 3f;
            case Cost -> multCost = 2f;
        }

        // Pour chaque variable, il y a un maximum de 100 score (avec mult 1) pouvant etre obtenu.
        for(Section s : sections){
            generalScore += (multEmission * 100 / (s.getCarbonEmission() / (100*s.getDistance()) + 1f));
            generalScore += (multDuration * 100 / (s.getDuration() / (200*s.getDistance()) + 1f));
            generalScore += (multCost * 100 / (s.getPrice() * 10/(30 + s.getDistance()) + 1f));
        }

        // Retourne le score
        score = generalScore;
        return generalScore;
    }

    /**
     * Retourne le score
     * @return Score (int)
     */
    public double getScore(){return score;}

    /**
     * Permet de changer le score
     * @param s int Score
     */
    public void setScore(double s){score = s;}

    /**
     * Getter de la distance
     * @return Retourne la distance du trajet en km
     */
    public double getDistance() {
        double dist = 0;

        // Pour chaque section on additione la distance
        for (Section s: sections) {
            dist += s.getDistance();
        }

        return dist;
    }
}
