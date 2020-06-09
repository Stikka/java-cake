package ProjektTorta;

public class WritingIcing extends Decoration {
	Cake cake;

	public WritingIcing(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Writing Icing";
	}

	public double cost() {
		return 6 + cake.cost();
	}
}