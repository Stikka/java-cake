package ProjektTorta;

public class AllStarChocolateCake extends Cake {

	public AllStarChocolateCake() { 
		name = "All-Star White Chocolate Cake";
		tier = "three";
		layer = "two-layers";
		size = "medium";
		description = "All-Star White Chocolate Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be square.");
	}
	
	void bake() {
		System.out.println("Bake for 45 min at 180 °C.");
	}
	
	public double cost() {
		return 45;
	}
}