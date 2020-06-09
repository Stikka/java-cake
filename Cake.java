package ProjektTorta;

public abstract class Cake {
	String name;
	String tier;
	String layer;
	String size;
	String description;
 
	void prepare() {}
  
	void bake() {}
 
	void shape() {
		System.out.println("Shape of it is going to be round.");
	}
	
	void set() {
		System.out.println("Place the cake onto a board.");
	}
  
	void cold() {
		System.out.println("Put the cake in the fridge.");
	}
	
	void box() {
		System.out.println("Just before the customer comes, place it into the official box.");
	}
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
 
	public String getName() {
		return name;
	}

}