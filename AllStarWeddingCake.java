package ProjektTorta;

public class AllStarWeddingCake extends Cake {

	public AllStarWeddingCake() { 
		name = "All-Star The Day Wedding Cake";
		tier = "three";
		layer = "two-layers";
		size = "medium";
		description = "All-Star The Day Wedding Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be square.");
	}
	
	void bake() {
		System.out.println("Bake for 35 min at 360 °C.");
	}
	
	public double cost() {
		return 85;
	}
}