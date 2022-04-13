package com.mycompany.mapsii.obj;

import com.mycompany.mapsii.obj.Enums.CarEnum;
import com.mycompany.mapsii.obj.Enums.VariableEnum;

/**
 * La class Preference permet de savoir les preferences de l'utilisateur.
 * Cette classe est un singleton puisque de toute maniere, il peut juste avoir 1 preference par instance de l'application.
 */
public class Preference {
    /**
     * Les variables pour sauvegarder la preference
     */
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

    /**
     * Pour modifier la preference
     * @param p Object Preference
     */
    public static void setInstance(Preference p){
        instance = p;
    }

    /**
     * Pour obtenir l'instance Preference
     * @return Le singleton Preference
     */
    public static Preference getInstance(){
        if(instance == null) { instance = new Preference(); }

        return instance;
    }

    /**
     * Permet de retourner un enum au lieu d'une string (CarType)
     * @return CarType
     */
    public CarEnum getCarType(){
        return CarEnum.valueOf(typeVoiture);
    }

    /**
     * Permet d'obtenir un enum au lieu d'une string (VariableImportante)
     * @return VariableEnum
     */
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
