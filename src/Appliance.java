
public class Appliance {
	private String name;
	private double energyconsumed; // in kWh
	private double cost;
	private int ecoRating; // Scale of 1-10

	private String type;
	
	public Appliance(String name, double energyconsumed, double cost, int ecoRating, String type) {
		this.name = name;
		this.energyconsumed = energyconsumed;
		this.cost = cost;
		this.ecoRating = ecoRating;
		this.type = type;
	}

	// Setters and getters
	
	public String getType() {
		return this.type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public double getEnergyconsumed() {
		return energyconsumed;
	}

	public void setEnergeyconsumed() {
		this.energyconsumed = energyconsumed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost() {
		this.cost = cost;

	}

	public int getEcorating() {
		return ecoRating;
	}

	public void setEcoratin() {
		this.ecoRating = ecoRating;
	}

	@Override

	public String toString() {
		return "Appliance{" + "Name: " + name + '\'' + ", Energy Consumption: " + energyconsumed + " Cost: " + cost
				+ "Eco Rating: " + ecoRating + '}';
	}
}
