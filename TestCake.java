package ProjektTorta;

import java.io.*;

public class TestCake{
 
	public static void main(String args[]) {
		
		String costumer1 = "Marilyn";
		CakeShop mon = new MonarchCakeShop();
		Cake cake1 = mon.orderCake("birthday");
		Cake type1 = new MonarchBirthdayCake();
		type1 = new Candle(type1);
		type1 = new Sprinkles(type1);
		type1 = new WhippedCream(type1);
		type1 = new DesignerIcing(type1);
		
		String sc1 = type1.getDescription();
		String sc12 = sc1.replace(cake1.getName() + ", ","");
		
		System.out.println("\n*** Information about order ***");
		System.out.println(costumer1 + " ordered a " + cake1.getName() + ".");
		System.out.println("Decorations added are: "
				+ sc12 + ".");
		System.out.println("Total price that " + costumer1 + " needs to pay is $"
				+ type1.cost() + ".");
		
		String costumer2 = "Nancy";
		CakeShop wed = new ParadiseCakeShop();
		Cake cake2 = wed.orderCake("wedding");
		Cake type2 = new ParadiseWeddingCake();
		type2 = new SugarButterfly(type2);
		type2 = new SugarButterfly(type2);
		type2 = new WaferDaisy(type2);
		type2 = new SugarHeart(type2);
		
		String sc2 = type2.getDescription();
		String sc22 = sc2.replace(cake1.getName() + ", ","");
		
		System.out.println("\n*** Information about order ***");
		System.out.println(costumer2 + " ordered a " + cake2.getName() + ".");
		System.out.println("Decorations added are: "
				+ sc22 + ".");
		System.out.println("Total price that " + costumer2 + " needs to pay is $"
				+ type2.cost() + ".");
		
		String costumer3 = "John";
		CakeShop cho = new AllStarCakeShop();
		Cake cake3 = cho.orderCake("chocolate");
		Cake type3 = new AllStarChocolateCake();
		type3 = new WritingIcing(type3);
		type3 = new JellySlice(type3);
		type3 = new JellySlice(type3);
		type3 = new JellySlice(type3);
		type3 = new ChocolateStar(type3);
		type3 = new Sprinkles(type3);
		
		String sc3 = type3.getDescription();
		String sc32 = sc3.replace(cake3.getName() + ", ","");
		
		System.out.println("\n*** Information about order ***");
		System.out.println(costumer3 + " ordered " + cake3.getName() + ".");
		System.out.println("Decorations added are: "
				+ sc32 + ".");
		System.out.println("Total price that " + costumer3 + " needs to pay is $"
				+ type3.cost() + ".");
	}
}
