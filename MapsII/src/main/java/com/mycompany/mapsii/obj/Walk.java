// BUT :        Projet synthèse : Créer une application pour optimiser la qualité du réseau des transports.
// AUTEURS :    André Pinel, Jérémie Ouimet, William Goulet et Francis Painchaud
// DATE :       17 avril 2022

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

// La marche ne consomme pas d'essence, donc ne génère aucune pollution,
// et la marche a une vitesse moyenne de 6km/h
public class Walk extends Transport{
    public Walk() {
        this.consommation = 0;
        this.speed = 6;
    }

    @Override
    public double getPrice(double distance){
        return 0;
    }

    @Override
    public double getEmission(double distance){
        return 0;
    }
}
