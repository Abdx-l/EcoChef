package ecochef_proto;
import java.sql.*;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
		
		
		
		Scanner input = new Scanner(System.in); 
		EcoChefDB sos = new EcoChefDB();

//		String type = "stove";
//		String name = "800 Series Gas Slide-in Range 30'' Stainless Steel";
//		double cost = 4200.00; // Dollars
//		int consumption = 5; //kWh
//		sos.addToList(type, name, cost, consumption);


		System.out.print("What appliance are you looking for: ");
		String appliance = input.nextLine(); // Variable here gets sent to be search in DB
		
		
		System.out.println("Here are some suggestions: "); 
		System.out.println(sos.search(appliance));
		

	}
	
	// Only used to add items to database
	public static void addToDB() {
		EcoChefDB oso = new EcoChefDB();
		Scanner input = new Scanner(System.in); 
		
		System.out.print("What type of item are you adding: ");
		String type = input.nextLine(); 
		type = type.replace(" ", "").toLowerCase();
		
		System.out.print("What's its name: ");
		String name = input.nextLine(); 
		name = name.replace(" ", "").toLowerCase();
		
		System.out.print("What's its name: ");
		double cost = input.nextDouble(); 
		
		System.out.print("What's its name: ");
		int consumption = input.nextInt(); 
		
		
		
		oso.addToList(type, name, cost, consumption);

		
	}

	
}
