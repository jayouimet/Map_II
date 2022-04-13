package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.CarEnum;
import com.mycompany.mapsii.obj.Enums.TransportEnum;

// Une section est une partie d'un trajet. Pour un trajet de A à C en passant par B,
// on a 2 sections: AB et BC
public class Section {
    // La longueur de la section
    private double distance;
    // Le transport utilisé (Permet la possibilité d'implémenter des trajet avec plusieurs véhicule)
    private Transport transport;

    /**
     * Constructeur d'une section
     * @param d La longueur de la section en km
     * @param t Le transport utilisé
     */
    public Section(double d, TransportEnum t) {
        distance = d;
        // Instancie le transport dépendemment de l'enum transport passé en paramètre
        switch (t) {
            case Bicycle:
                transport = new Bicycle();
                break;
            case Bus:
                transport = new Bus();
                break;
            case Metro:
                transport = new Metro();
                break;
            case Taxi:
                transport = new Taxi();
                break;
            case Car:
                // Instancie le transport dépendemment des préférences
                Preference pref = Preference.getInstance();
                switch(pref.getCarType()) {
                    case Electric:
                        transport = new Electric();
                        break;
                    case Hybrid:
                        transport = new Hybrid();
                        break;
                    case Truck:
                        transport = new Truck();
                        break;
                    case SUV:
                        transport = new SUV();
                        break;
                }
                break;
            default:
                transport = new Walk();
                break;
        }
    }

    /**
     * Getter de distance
     * @return Retourne la longueur de la section en km
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Getter de duration
     * @return Retourne la durée du trajet en secondes
     */
    public double getDuration() {
        return distance / transport.getSpeed() * 3600;
    }

    /**
     * Getter du prix
     * @return Retourne le coût de la section en $
     */
    public double getPrice() {
        return transport.getPrice(distance);
    }

    /**
     * Getter de l'émission de CO2
     * @return Retourne l'émission de CO2 en kg
     */
    public double getCarbonEmission() {
        return transport.getEmission(distance);
    }
}
