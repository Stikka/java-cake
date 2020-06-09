package ProjektTorta;

public class DesignerIcing extends Decoration {
	Cake cake;

	public DesignerIcing(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Designer Icing";
	}

	public double cost() {
		return 3 + cake.cost();
	}
}