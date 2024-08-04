
public class StoveTop extends Appliance {
    private int numberofBurners;

    public StoveTop(String name, double energyconsumed, int ecoRating, double cost, int numberofBurners) {
        super(name, energyconsumed, cost, ecoRating, "StoveTop");
        this.numberofBurners = numberofBurners;

    }

    public void setNumberOfBurners(int numberofBurners) {
        this.numberofBurners = numberofBurners;
    }

    @Override

    public String toString() {
        return "StoveTop{" + "Number of Burners: " + numberofBurners + ", " + super.toString() + '}';
    }
}
