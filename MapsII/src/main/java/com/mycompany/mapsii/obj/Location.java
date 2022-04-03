/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

/**
 *
 * @author Andre
 */
public class Location {
    private String name;
    private double longitude;
    private double latitude;
    
    public Location(String name, double longitude, double latitude){
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public String getName(){  return name;  }
    
    public double getLongitude(){ return longitude; }
    
    public double getLatitude(){ return latitude; }
    
    public double getDistance(Location destination){
        double x;
        double y;
        
        x = longitude - destination.longitude;
        if(x<0)
            x=x*-1;
        
        y = latitude - destination.latitude;
        if(y<0)
            y=y*-1;
        
        return x+y;   
    }
}
