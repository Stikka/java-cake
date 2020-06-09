package ProjektTorta;

public class MonarchBirthdayCake extends Cake {

	public MonarchBirthdayCake() { 
		name = "Monarch Kids Birthday Cake";
		tier = "two";
		layer = "three-layers";
		size = "big";
		description = "Monarch Kids Birthday Cake";
	}
 
	void prepare() {
		System.out.println("It will have " + tier + " tiers, " + layer + 
				" and its size will be " + size + ".");
	}
	
	public double cost() {
		return 60;
	}
}