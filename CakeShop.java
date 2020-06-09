package ProjektTorta;

public abstract class CakeShop {
 
	abstract Cake createCake(String item);
 
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		System.out.println("\n*** Making the " + cake.getName() + " ***");
		cake.prepare();
		cake.shape();
		cake.bake();
		cake.set();
		cake.cold();
		cake.box();
		return cake;
	}
}