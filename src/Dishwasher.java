
public class Dishwasher extends Appliance {
    private int capacity; // no. of place settings

    public Dishwasher(String name, double energyconsumed, int ecoRating, double cost, int capacity) {
        super(name, energyconsumed, cost, ecoRating);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override

    public String toString() {
        return "Dishwasher{" + "Capacity: " + capacity + ", " + super.toString() + '}';
    }

}
