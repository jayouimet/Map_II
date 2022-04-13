/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

// Une location géographique en longitude et latitude
public class Location {
    private String name;
    private double longitude;
    private double latitude;

    /**
     * Constructeur d'une location
     * @param address L'adresse de la location
     */
    public Location(String address) {
        // Initialisation du context de l'API de Google Maps
        // Ici on a ma clée d'api Google Maps. Comme je suis chargé par appel à l'API (avec crédit sur les 20000 premiers appels, je vais désactiver cette clé une fois le travail évalué)
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBWWBZVYdKruimvJIkHMcJbG0QSTkWXHDk");
        try {
            // Requête à l'API
            GeocodingResult[] request = GeocodingApi.newRequest(context).address(address).await();
            // Location retournée
            LatLng location = request[0].geometry.location;
            // Instanciation des attributs
            this.latitude = location.lat;
            this.longitude = location.lng;
            this.name = address;
        } catch (Exception e) {
            this.name = null;
            this.latitude = 0;
            this.longitude = 0;
        }
    }

    /**
     * Getter de nom
     * @return Retourne le nom de la location
     */
    public String getName(){  return name;  }

    /**
     * Getter de longitude
     * @return Retourne la longitude
     */
    public double getLongitude(){ return longitude; }

    /**
     * Getter de latitude
     * @return Retourne la latitude
     */
    public double getLatitude(){ return latitude; }

    /**
     * Getter de la distance entre 2 points
     * @param destination Location du point B
     * @return Retourne la distance entre 2 points en km
     */
    public double getDistance(Location destination) {
        double latDiff, longDiff, latKm, longKm;
        // Calcul de différence de longitude et latitude
        latDiff = Math.abs(this.latitude - destination.latitude);
        longDiff = Math.abs(this.longitude - destination.longitude);
        // Approximation de la différence de latitude en km
        latKm = latDiff * 110.574;
        // Approximation de la différence de longitude en km
        longKm = Math.cos(Math.toRadians(this.latitude)) * longDiff * 111.320;

        // 1.3 pour approximer une distance avec tournants (Pas à vol d'oiseau)
        return Math.sqrt(latKm * latKm + longKm * longKm) * 1.3;
    }

    /**
     * Retourne si la location est valide
     * @return Vrai si valide et faux autrement
     */
    public boolean isValid() {
        return name != null;
    }
}
