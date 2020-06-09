package ProjektTorta;

public class ChocolateStar extends Decoration {
	Cake cake;

	public ChocolateStar(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Chocolate Star";
	}

	public double cost() {
		return 1 + cake.cost();
	}
}
