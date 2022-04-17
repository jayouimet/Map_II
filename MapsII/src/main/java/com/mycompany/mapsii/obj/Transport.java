// BUT :        Projet synthèse : Créer une application pour optimiser la qualité du réseau des transports.
// AUTEURS :    André Pinel, Jérémie Ouimet, William Goulet et Francis Painchaud
// DATE :       17 avril 2022

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 * La classe abstraite Transport est parent à tous les types de transports
 * Un transport X héritant de Transport écrasera les données des variables
 * de consommation et de vitesse, ainsi que la déclaration des fonctions
 * si le besoin y est.
 */
public abstract class Transport {
    protected double consommation;
    protected double speed;

    public Transport() {

    }

    /**
     * Le constructeur de Transport
     * @param consommation Consommation
     * @param speed Vitesse
     */
    public Transport(double consommation, double speed) {
        this.consommation = consommation;
        this.speed = speed;
    }

    /**
     * Obtenir la consommation du transport
     * @return Consommation
     */
    public double getConsommation() {
        return consommation;
    }

    /**
     * Permet de retourner la vitesse du transport
     * @return La vitesse (double)
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Retourne la quantité d'essence utilisée multipliée par son prix estimé
     * @param distance Distance (double)
     * @return Prix
     */
    public double getPrice(double distance) {
        return distance * consommation / 100 * 1.75;
    }

    ;

    /**
     * Retourne la quantité d'essence utilisée multipliée par la quantité de CO2 généré en kg par litre
     * @param distance Distance (double)
     * @return Emission (double)
     */
    public double getEmission(double distance) {
        return distance * consommation * 2.3;
    }

    ;
}
