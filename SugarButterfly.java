package ProjektTorta;

public class SugarButterfly extends Decoration {
	Cake cake;

	public SugarButterfly(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Sugar Butterfly";
	}

	public double cost() {
		return 1.5 + cake.cost();
	}
}