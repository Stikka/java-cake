package ProjektTorta;

public class AllStarBirthdayCake extends Cake {

	public AllStarBirthdayCake() { 
		name = "All-Star Birthday Party Cake";
		tier = "three";
		layer = "two-layers";
		size = "medium";
		description = "All-Star Birthday Party Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be square.");
	}
	
	void bake() {
		System.out.println("Bake for 55 min at 180 °C.");
	}
	
	public double cost() {
		return 65;
	}
}