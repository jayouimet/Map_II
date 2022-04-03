/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 *
 * @author Andre
 */
public class Metro extends Transport {
    public Metro() {
        this.consommation = 0;
        this.speed = 30;
    }

    @Override
    public double getPrice(double distance){
        return 3.5;
    }

    @Override
    public double getEmission(double distance){
        return distance * 0.0025;
    }
}
