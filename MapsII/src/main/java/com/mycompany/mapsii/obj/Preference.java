package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.CarEnum;
import com.mycompany.mapsii.obj.Enums.VariableEnum;

public class Preference {
    private static String[] mesuresDistance = {"KM", "Miles"};
    private static String[] couleursFond = {"Gray", "White"};

    public static String[] getOptionsMeasure() { return mesuresDistance; }
    public static String[] getOptionsColor() { return couleursFond; }

    private static Preference instance = null;

    public String variableDominante;
    public int mesureDistance;
    public String typeVoiture;

    public int couleurFond;

    private Preference(){}

    public static void setInstance(Preference p){
        instance = p;
    }

    public static Preference getInstance(){
        if(instance == null) { instance = new Preference(); }

        return instance;
    }

    public CarEnum getCarType(){
        return CarEnum.valueOf(typeVoiture);
    }

    public VariableEnum getImportantVariable(){
        return VariableEnum.valueOf(variableDominante);
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
