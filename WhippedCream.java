package ProjektTorta;

public class WhippedCream extends Decoration {
	Cake cake;

	public WhippedCream(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Whipped Cream";
	}

	public double cost() {
		return 3.5 + cake.cost();
	}
}