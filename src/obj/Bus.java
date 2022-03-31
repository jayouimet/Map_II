package obj;

public class Bus extends Transport {
    private double consumption = 6.2;
    private double speed = 50;

    public double getPrice(){
        return 4.5;
    }

    public double getEmission(double distance){
        return super.getEmission(distance) / 40;
    }
}
