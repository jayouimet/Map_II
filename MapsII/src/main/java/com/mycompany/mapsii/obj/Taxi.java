/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

public class Taxi extends Transport {
    public Taxi() {
        this.consommation = 9;
        this.speed = 50;
    }

    @Override
    public double getPrice(double distance) {
        return 3.45 + 1.7 * distance;
    }
}
