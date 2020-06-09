package ProjektTorta;

public class AllStarCheeseCake extends Cake {

	public AllStarCheeseCake() { 
		name = "All-Star Edam Cheese Cake";
		tier = "three";
		layer = "two-layers";
		size = "medium";
		description = "All-Star Edam Cheese Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be square.");
	}
	
	public double cost() {
		return 35;
	}
}