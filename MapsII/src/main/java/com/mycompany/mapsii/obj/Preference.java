package com.mycompany.mapsii.obj;

public class Preference {
    private static String[] mesuresDistance = {"KM", "Miles"};
    private static String[] typesVoiture = {"SUV", "Electric"};
    private static String[] couleursFond = {"Gray", "White"};

    public static String[] getOptionsMesure() { return mesuresDistance; }
    public static String[] getCouleursFond() { return couleursFond; }
    public static String[] getTypesVoiture() { return typesVoiture; }

    private static Preference instance = null;

    public String variableDominante;
    public int mesureDistance;
    public int typeVoiture;
    public int couleurFond;

    private Preference(){}

    public static void setInstance(Preference p){
        instance = p;
    }

    public static Preference getInstance(){
        if(instance == null) { instance = new Preference(); }

        return instance;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "variableDominante=" + variableDominante + '\'' +
                ", mesureDistance=" + mesureDistance +
                ", typeVoiture=" + typeVoiture +
                ", couleurFond=" + couleurFond +
                '}';
    }
}
