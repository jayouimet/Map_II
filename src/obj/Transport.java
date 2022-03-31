package obj;

public abstract class Transport {
    private double consumption;
    private double speed;

    public abstract double getPrice();
    public abstract double getEmission();

    public double getSpeed() {
        return this.speed;
    }

    public double getConsumption() {
        return this.consumption;
    }
}