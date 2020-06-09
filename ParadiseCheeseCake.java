package ProjektTorta;

public class ParadiseCheeseCake extends Cake {

	public ParadiseCheeseCake() { 
		name = "Paradise Cheese Cake";
		tier = "one";
		layer = "four-layers";
		size = "small";
		description = "Paradise Cheese Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tier, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be oval.");
	}
	
	public double cost() {
		return 39;
	}
}