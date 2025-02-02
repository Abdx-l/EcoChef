public class DeepFryer extends Appliance {
    private double oilCapacity; // in litres

    public DeepFryer(String name, double energyconsumed, double cost, int ecoRating, double oilCapacity) {
        super(name, energyconsumed, cost, ecoRating, "DeepFryer");
        this.oilCapacity = oilCapacity;
    }

    public double getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(double oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    @Override
    public String toString() {
        return "DeepFryer{" + "Oil Capacity: " + oilCapacity + ", " + super.toString() + '}';
    }
}

