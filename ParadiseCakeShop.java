package ProjektTorta;

public class ParadiseCakeShop extends CakeShop {

	Cake createCake(String item) {
		if (item.equals("birthday")) {
			return new ParadiseBirthdayCake();
		} else if (item.equals("wedding")) {
			return new ParadiseWeddingCake();
		} else if (item.equals("chocolate")) {
			return new ParadiseChocolateCake();
		} else if (item.equals("cheese")) {
			return new ParadiseCheeseCake();
		} else return null;
	}
}