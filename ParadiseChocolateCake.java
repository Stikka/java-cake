package ProjektTorta;

public class ParadiseChocolateCake extends Cake {

	public ParadiseChocolateCake() { 
		name = "Paradise Chocolate Cake";
		tier = "one";
		layer = "four-layers";
		size = "small";
		description = "Paradise Chocolate Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tier, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be oval.");
	}
	
	void bake() {
		System.out.println("Bake for 60 min at 170 °C.");
	}
	
	public double cost() {
		return 49;
	}
}