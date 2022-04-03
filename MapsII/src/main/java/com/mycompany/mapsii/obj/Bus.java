/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 *
 * @author Andre
 */
public class Bus extends Transport {
    public Bus() {
        this.consommation = 6.2;
        this.speed = 50;
    }

    @Override
    public double getPrice(double distance){
        return 4.75;
    }

    @Override
    public double getEmission(double distance){
        return super.getEmission(distance) / 40;
    }
}
