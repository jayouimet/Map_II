package com.mycompany.mapsii.obj;

public class Preference {
    private static Preference instance = null;

    public String test;

    private Preference(){}

    public static void setInstance(Preference p){
        instance = p;
    }

    public static Preference getInstance(){
        if(instance == null) { instance = new Preference(); }

        return instance;
    }
}
