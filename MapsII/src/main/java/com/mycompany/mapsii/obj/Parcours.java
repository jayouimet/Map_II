// BUT :        Projet synthèse : Créer une application pour optimiser la qualité du réseau des transports.
// AUTEURS :    André Pinel, Jérémie Ouimet, William Goulet et Francis Painchaud
// DATE :       17 avril 2022

package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.TransportEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Un parcours contient un ensemble de trajets selon leur moyen de transport
public class Parcours {
    // Liste de transports possibles
    private TransportEnum[] transports = TransportEnum.values();
    // Les trajets
    private Map<TransportEnum, Trajet> trajets;

    /**
     * Constructeur de parcours
     * @param locations Prend une liste de locations en paramètre
     */
    public Parcours(List<Location> locations) {
        trajets = new HashMap<>();
        // Pour chaque transport, on lui créé son trajet
        for (TransportEnum transport: transports) {
            trajets.put(transport, new Trajet(locations, transport));
        }
    }

    /**
     * Retourne le trajet lié au transport recherché
     * @param transport Le transport recherché
     * @return Le trajet retourné
     */
    public Trajet getTrajet(TransportEnum transport) {
        return trajets.get(transport);
    }

    /**
     * Getter de trajets
     * @return Retourne la Map de Transport -> Trajet
     */
    public Map<TransportEnum, Trajet> getTrajets() {
        return trajets;
    }

    /**
     * Retourne le trajet ayant le meilleur score
     * @return Une pair contenant le trajet recommandé et son moyen de transport
     */
    public Map.Entry<TransportEnum, Trajet> getBest() {
        Map.Entry<TransportEnum, Trajet> bestTrajet = null;

        for (Map.Entry<TransportEnum, Trajet> entry: trajets.entrySet()) {
            if (bestTrajet == null || entry.getValue().getScore() > bestTrajet.getValue().getScore()) {
                bestTrajet = entry;
            }
        }

        return bestTrajet;
    }
}
