/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

// La classe abstraite Transport est parent à tous les types de transports
// Un transport X héritant de Transport écrasera les données des variables
// de consommation et de vitesse, ainsi que la déclaration des fonctions
// si le besoin y est.
public abstract class Transport {
    protected double consommation;
    protected double speed;

    public Transport() {

    }

    public Transport(double consommation, double speed){
        this.consommation = consommation;
        this.speed = speed;
    }
    
    public double getConsommation(){
        return consommation;
    }
    
    public double getSpeed(){
        return speed;
    }

    // Retourne le nombre d'essence utilisé * son prix estimé
    public double getPrice(double distance) {
        return distance * consommation / 100 * 1.75;
    };

    // Retourns le nombre d'essence utilisé * le nombre de CO2 générer en kg par litre
    public double getEmission(double distance) {
        return distance * consommation * 2.3;
    };
}
