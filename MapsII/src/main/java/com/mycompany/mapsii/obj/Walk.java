/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 *
 * @author Andre
 */
public class Walk extends Transport{
    
    private double price;
    private double emission;
    
    public Walk(double consommation, double speed, double price, double emission){
        super(consommation,speed);
    }
    
    public double getPrice(){
        return this.price; 
    }
    
    public double getEmission(){
        return this.emission; 
    }
    
}
