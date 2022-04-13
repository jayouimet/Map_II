package com.mycompany.mapsii.obj;

import java.util.ArrayList;
import java.util.List;

// La classe engine est le conteneur de l'engin de calcul de trajets.
// Elle est obsolète vu notre implémentation partielle de Google Maps,
// mais aurait été nécessaire dans une implémentation complète dans le futur
public class Engine {
    // On objet parcours qui contient un ensemble de trajets par véhicule
    private Parcours parcours;

    /**
     * Constructeur de la classe engin, prend une liste de locations comme paramètre
     * @param locations
     */
    public Engine(List<Location> locations) {
        parcours = new Parcours(locations);
    }

    /**
     * Retourne l'attribut parcours
     * @return
     */
    public Parcours getParcours() {
        return parcours;
    }
}
