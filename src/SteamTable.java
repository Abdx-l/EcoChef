public class SteamTable extends Appliance {
    private int numberOfPans;

    public SteamTable(String name, double energyconsumed, double cost, int ecoRating, int numberOfPans) {
        super(name, energyconsumed, cost, ecoRating, "SteamTable");
        this.numberOfPans = numberOfPans;
    }

    public int getNumberOfPans() {
        return numberOfPans;
    }

    public void setNumberOfPans(int numberOfPans) {
        this.numberOfPans = numberOfPans;
    }

    @Override
    public String toString() {
        return "SteamTable{" + "Number Of Pans:     " + numberOfPans + ", " + super.toString() + '}';
    }
}
