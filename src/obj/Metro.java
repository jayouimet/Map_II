package obj;

public class Metro extends Transport {
    private double consumption = 792;
    private double speed = 40;

    public double getPrice(){
        return 30;
    }

    public double getEmission(double distance){
        return super.getEmission(distance) / 250;
    }
}
