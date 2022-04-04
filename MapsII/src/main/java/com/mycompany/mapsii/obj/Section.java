package com.mycompany.mapsii.obj;

public class Section {
    private double distance;
    private Transport transport;

    public Section(double d, TransportEnum t) {
        distance = d;

        switch (t) {
            case Bicycle:
                transport = new Bicycle();
                break;
            case Bus:
                transport = new Bus();
                break;
            case Metro:
                transport = new Metro();
                break;
            case Walk:
                transport = new Walk();
                break;
            case Taxi:
                transport = new Taxi();
                break;
            case Car:

                break;
        }
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        // Returns the duration in seconds (distance in km / km/h * seconds in an hour)
        return distance / transport.getSpeed() * 3600;
    }

    public double getPrice() {
        return transport.getPrice(distance);
    }

    public double getCarbonEmission() {
        return transport.getEmission(distance);
    }
}
