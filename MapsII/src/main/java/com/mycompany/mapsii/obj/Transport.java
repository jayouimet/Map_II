/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 *
 * @author Andre
 */
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

    public double getPrice(double distance) {
        return distance * consommation / 100 * 1.75;
    };
    
    public double getEmission(double distance) {
        return distance * consommation * 2.3;
    };
}
