package ProjektTorta;

public class ParadiseWeddingCake extends Cake {

	public ParadiseWeddingCake() { 
		name = "Paradise Wedding Cake";
		tier = "one";
		layer = "four-layers";
		size = "small";
		description = "Paradise Wedding Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tier, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be oval.");
	}
	
	void bake() {
		System.out.println("Bake for 45 min at 345 °C.");
	}
	
	public double cost() {
		return 77;
	}
}