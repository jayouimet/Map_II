/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapsii.obj;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

public class Location {
    private String name;
    private double longitude;
    private double latitude;

    public Location(String address) {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBWWBZVYdKruimvJIkHMcJbG0QSTkWXHDk");
        try {
            GeocodingResult[] request = GeocodingApi.newRequest(context).address(address).await();
            LatLng location = request[0].geometry.location;
            this.latitude = location.lat;
            this.longitude = location.lng;
            this.name = address;
        } catch (Exception e) {
            this.name = null;
            this.latitude = 0;
            this.longitude = 0;
        }
    }

    public Location(String name, double longitude, double latitude){
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public String getName(){  return name;  }
    
    public double getLongitude(){ return longitude; }
    
    public double getLatitude(){ return latitude; }
    
    /*public double getDistance(Location destination){
        double x;
        double y;
        
        x = longitude - destination.longitude;
        if(x<0)
            x=x*-1;
        
        y = latitude - destination.latitude;
        if(y<0)
            y=y*-1;
        
        return x+y;   
    }*/

    public double getDistance(Location destination) {
        double latDiff, longDiff, latKm, longKm;

        latDiff = Math.abs(this.latitude - destination.latitude);
        longDiff = Math.abs(this.longitude - destination.longitude);

         latKm = latDiff * 110.574;
         longKm = Math.cos(Math.toRadians(this.latitude)) * longDiff * 111.320;

        return Math.sqrt(latKm * latKm + longKm * longKm);
    }

    public boolean isValid() {
        return name != null;
    }
}
