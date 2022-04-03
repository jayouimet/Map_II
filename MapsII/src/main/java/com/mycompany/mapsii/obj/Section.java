package com.mycompany.mapsii.obj;

public class Section {
    private double distance;
    private Transport transport;

    public Section(double d, Class t) {
        Object instance;
        try {
            instance = t.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return;
        }

        if (instance instanceof Transport) {
            distance = d;
            transport = (Transport) instance;
        }
    }

    public double getDistance() {
        return distance;
    }

    public double Duration() {
        // Returns the duration in seconds (distance in km / km/h * seconds in an hour)
        return distance / transport.getSpeed() * 3600;
    }
}
