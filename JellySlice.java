package ProjektTorta;

public class JellySlice extends Decoration {
	Cake cake;

	public JellySlice(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", Jelly Slice";
	}

	public double cost() {
		return .5 + cake.cost();
	}
}