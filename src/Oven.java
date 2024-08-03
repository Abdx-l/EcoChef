public class Oven extends Appliance {
    private double capacity; // in cubic feet

    public Oven(String name, double energyconsumed, double cost, int ecoRating, double capacity) {
        super(name, energyconsumed, cost, ecoRating);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Oven{" + "Capacity: " + capacity + ", " + super.toString() + '}';
    }
}
