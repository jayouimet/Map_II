/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

// Un métro ne consomme pas d'essence et
// a une vitesse de 40km/h
public class Metro extends Transport {
    public Metro() {
        this.consommation = 0;
        this.speed = 40;
    }

    // Le prix du billet est de 3.5$
    @Override
    public double getPrice(double distance){
        return 3.5;
    }

    // Il y a une trace d'émission de 2.5g au km
    @Override
    public double getEmission(double distance){
        return distance * 0.0025;
    }
}
