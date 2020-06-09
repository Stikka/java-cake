package ProjektTorta;

public class Sprinkles extends Decoration {
	Cake cake;

	public Sprinkles(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Sprinkles";
	}

	public double cost() {
		return 5 + cake.cost();
	}
}
