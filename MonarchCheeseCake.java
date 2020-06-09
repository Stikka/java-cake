package ProjektTorta;

public class MonarchCheeseCake extends Cake {

	public MonarchCheeseCake() { 
		name = "Monarch Extra Cheese Cake";
		tier = "two";
		layer = "three-layers";
		size = "big";
		description = "Monarch Extra Cheese Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	public double cost() {
		return 30;
	}
}