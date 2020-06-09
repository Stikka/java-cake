package ProjektTorta;

public class MonarchChocolateCake extends Cake {

	public MonarchChocolateCake() { 
		name = "Monarch Choco Choco Cake";
		tier = "two";
		layer = "three-layers";
		size = "big";
		description = "Monarch Choco Choco Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void bake() {
		System.out.println("Bake for 50 min at 180 °C.");
	}
	
	public double cost() {
		return 50;
	}
}