import java.util.ArrayList;
import java.util.List;

public class ApplianceDatabase {

	  private List<Appliance> appliances = new ArrayList<>();
	  
	  
	  public void add(Appliance appliance) {
		  this.appliances.add(appliance);
	  }
	  
	  public Appliance getByName(String name) {
		  for(Appliance appliance: appliances ) {
			  if(appliance.getName().equals(name))
				  return appliance;
		  }
		  return null;
	  }
	  public Appliance getcheapest(String type) {
		  double cheapest = Integer.MAX_VALUE;
		  Appliance found = null;
		  for(Appliance appliance: appliances) {
			  if(appliance.getType().equals(type) && appliance.getCost() < cheapest) {
				  found = appliance;
				  cheapest = appliance.getCost();
			  }
		  }
		  return found;
	  }
}
