
public class Freezer extends Appliance {
    private double volume; // in cubic feet

    public Freezer(String name, double energyconsumed, double cost, int ecoRating, double volume) {
        super(name, energyconsumed, cost, ecoRating);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Freezer{" + "Volume: " + volume + ", " + super.toString() + '}';
    }

}
