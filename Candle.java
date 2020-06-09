package ProjektTorta;

public class Candle extends Decoration {
	Cake cake;

	public Candle(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Candle";
	}

	public double cost() {
		return 2 + cake.cost();
	}
}