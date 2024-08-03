public class Grill extends Appliance {
    private double cookingArea; // in square inches

    public Grill(String name, double energyconsumed, double cost, int ecoRating, double cookingArea) {
        super(name, energyconsumed, cost, ecoRating);
        this.cookingArea = cookingArea;
    }

    public double getCookingArea() {
        return cookingArea;
    }

    public void setCookingArea(double cookingArea) {
        this.cookingArea = cookingArea;
    }

    @Override
    public String toString() {
        return "Grill{" + "Cooking Area: " + cookingArea + ", " + super.toString() + '}';
    }
}
