/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

// L'autobus a une consommation de 65L au 100km
// et une vitesse estimée à 50km/h
public class Bus extends Transport {
    public Bus() {
        this.consommation = 65;
        this.speed = 50;
    }

    // Le prix du billet d'autobus est de 4.75$
    @Override
    public double getPrice(double distance){
        return 4.75;
    }

    // L'émission de carbone est divisée par 40, car on a une capacité de 40 passagers
    @Override
    public double getEmission(double distance){
        return super.getEmission(distance) / 40;
    }
}
