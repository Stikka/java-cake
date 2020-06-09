package ProjektTorta;

public class AllStarCakeShop extends CakeShop {

	Cake createCake(String item) {
		if (item.equals("birthday")) {
			return new AllStarBirthdayCake();
		} else if (item.equals("wedding")) {
			return new AllStarWeddingCake();
		} else if (item.equals("chocolate")) {
			return new AllStarChocolateCake();
		} else if (item.equals("cheese")) {
			return new AllStarCheeseCake();
		} else return null;
	}
}