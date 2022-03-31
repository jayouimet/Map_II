package obj;

public abstract class Transport {
    private double consommation;
    private double speed;

    public abstract double getPrice();
    public abstract double getEmission();

    public double getSpeed() {
        return this.speed;
    }

    public double getConsommation() {
        return this.consommation;
    }
}