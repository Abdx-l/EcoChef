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
}
