package ProjektTorta;

public class MonarchCakeShop extends CakeShop {

	Cake createCake(String item) {
		if (item.equals("birthday")) {
			return new MonarchBirthdayCake();
		} else if (item.equals("wedding")) {
			return new MonarchWeddingCake();
		} else if (item.equals("chocolate")) {
			return new MonarchChocolateCake();
		} else if (item.equals("cheese")) {
			return new MonarchCheeseCake();
		} else return null;
	}
}