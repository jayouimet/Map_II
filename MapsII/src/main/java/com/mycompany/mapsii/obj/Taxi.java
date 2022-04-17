// BUT :        Projet synthèse : Créer une application pour optimiser la qualité du réseau des transports.
// AUTEURS :    André Pinel, Jérémie Ouimet, William Goulet et Francis Painchaud
// DATE :       17 avril 2022

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

// On approxime la consommation d'un taxi à 9L/100km et sa vitesse à
// 50 km/h
public class Taxi extends Transport {
    public Taxi() {
        this.consommation = 9;
        this.speed = 50;
    }

    // Le prix du taxi est calculé par un coût de base de 3.45$ et
    // un ajout de 1.70$ par km
    @Override
    public double getPrice(double distance) {
        return 3.45 + 1.7 * distance;
    }
}
