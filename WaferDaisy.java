package ProjektTorta;

public class WaferDaisy extends Decoration {
	Cake cake;

	public WaferDaisy(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Wafer Daisy";
	}

	public double cost() {
		return 1 + cake.cost();
	}
}