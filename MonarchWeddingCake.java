package ProjektTorta;

public class MonarchWeddingCake extends Cake {

	public MonarchWeddingCake() { 
		name = "Monarch Rich Wedding Cake";
		tier = "two";
		layer = "three-layers";
		size = "big";
		description = "Monarch Rich Wedding Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void bake() {
		System.out.println("Bake for 40 min at 350 C.");
	}
	
	public double cost() {
		return 70;
	}
}