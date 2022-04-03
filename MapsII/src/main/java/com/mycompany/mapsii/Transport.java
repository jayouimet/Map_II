/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii;

/**
 *
 * @author Andre
 */
public abstract class Transport {
    private double consommation;
    private double speed;
    
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
    
    public abstract double getPrice();
    
    public abstract double getEmission();
      
}
