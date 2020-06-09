package ProjektTorta;

public class SugarHeart extends Decoration {
	Cake cake;

	public SugarHeart(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Sugar Heart";
	}

	public double cost() {
		return 1.5 + cake.cost();
	}
}
