
public class Main {

	public static void main(String[] args) {
		System.out.println("starting");
		new Main().run();
	}

	private void run() {
		ApplianceDatabase db = init();

		System.out.println(db.getcheapest("Oven"));
	}

	private ApplianceDatabase init() {
     ApplianceDatabase db = new ApplianceDatabase();
      
     db.add(new StoveTop("Bosch 800",1.8,9,1499,4));
     db.add(new StoveTop("Samsung ",1.8,8,1199,4));
     db.add(new StoveTop("KitchenAid KICU509XSS",1.8,8,1399,4));
     db.add(new StoveTop("Wolf CI365C/S",1.8,9,2199,4));
     db.add(new StoveTop("Frigidaire FGIC3067MB",1.8,8,1099,4));
     
     db.add(new Dishwasher("Bosch 800 Series SHP878ZD5N",1.1,9,1499,16));
     db.add(new Dishwasher("Miele G 7566 SCVi",1.1,9,2299,20));
     db.add(new Dishwasher("KitchenAid KDTE334GPS",1.1,9,1399,14));
     db.add(new Dishwasher("Samsung DW80R9950UG",1.1,8,1199,14));
     db.add(new Dishwasher("Whirlpool WDT750SAKZ",1.1,8,999,12));
     
     db.add(new Fridge("LG LFXS28968S",0.074,999,8,300));
     db.add(new Fridge("Samsung RF28R7351SG",0.082,2099,9,330));
     db.add(new Fridge("Bosch B36CL80ENS",0.068,3199,9,320));
     db.add(new Fridge("GE Profile PYE22PSKSS",0.075,2299,8,250));
     db.add(new Fridge("Whirlpool WRX735SDHZ",0.078,1799,8,300));
     
     db.add(new Grill("Weber Genesis II E-315",8.8,1299,8,450));
     db.add(new Grill("Napoleon Rogue 425",9.4,799,8,400));
     db.add(new Grill("Broil King Baron 490",11.7,899,8,425));
     db.add(new Grill("Char-Broil Performance 4-Burner",10.6,499,8,350));
     db.add(new Grill("George Foreman Indoor/Outdoor Grill",1.5,249,9,250));
     
     db.add(new Oven("Bosch 800 Series HBL8453UC",3.6,2499,9,70));
     db.add(new Oven("KitchenAid KODE500ESS",3.4,2299,9,60));
     db.add(new Oven("Samsung NV51K7770DG",3.4,1899,8,600));
     db.add(new Oven("GE Profile PT9050SFSS",3.7,2299,8,60));
     db.add(new Oven("Whirlpool WOS51EC0HS",3.3,1699,8,60));
     
     db.add(new DeepFryer("Breville BDF500XL Smart Fryer",1.8,299,9,4));
     db.add(new DeepFryer("T-Fal FR8000",1.8,169,8,4));
     db.add(new DeepFryer("DeLonghi D34528DZ",1.8,199,8,4));
     db.add(new DeepFryer("Hamilton Beach 35021",1.7,129,8,5));
     db.add(new DeepFryer("Cuisinart CDF-200P1",1.8,159,8,4));
     
     db.add(new SteamTable("Carter-Hoffmann 3-Well Steam Table",2.5,1399,9,10));
     db.add(new SteamTable("Nemco 6000A 2-Well Steam Table",2.0,1199,8,8));
     db.add(new SteamTable("Vollrath 2-Well Steam Table",1.8,1099,8,8));
     db.add(new SteamTable("Star 3-Well Steam Table",2.2,1299,8,12));
     db.add(new SteamTable("Berkel 3-Well Steam Table",2.4,1499,8,12));
     
     
     


    
	return db;
	}

}
