package fantasy;

import java.util.Random;

public abstract class Item implements IPurchasable {
	protected String itemType;
	protected int price;
	
	@Override
	public void isPurchasable() {
		System.out.println(itemType + " ist für " + price + " Goldstücke kaufbar.");
	} 
	private static Random rand = new Random();
	public static Item create() {
		switch (rand.nextInt(2)) {
		case 0:
			return new Sword();
		case 1:
			return new Bow();
		default:
			System.out.println("Fehler in rand");	
			return null;
		}
		
	}
}
