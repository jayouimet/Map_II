package obj;

public abstract class Transport {

    /**
     * The consumption and the speed of the transport are private to not set them outside the class
     */
    private double consumption;
    private double speed;

    /**
     * Method to get the price of the transport
     * @return The price (default : 0)
     */
    public double getPrice(){
        return 0;
    }

    /**
     * Calculate the quantity of C02 produced by the transport method
     * @param distance
     * @return The C02 quantity (kg)
     */
    public double getEmission(double distance){
        return distance * consumption * 2.3;
    }

    /**
     * Method to get the speed of the transport
     * @return The speed (km/hr)
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Method to get the consumption of the transport
     * @return The consumption (L/100km)
     */
    public double getConsumption() {
        return this.consumption;
    }
}