package ProjektTorta;

public class ParadiseBirthdayCake extends Cake {

	public ParadiseBirthdayCake() { 
		name = "Paradise Birthday Cake";
		tier = "one";
		layer = "four-layers";
		size = "small";
		description = "Paradise Birthday Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tier, " + layer + 
				" and its size will be " + size + ".");
	}
	
	void shape() {
		System.out.println("Shape of it is going to be oval.");
	}
	
	public double cost() {
		return 57;
	}
}