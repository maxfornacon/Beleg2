package fantasy;

import java.util.Random;

public abstract class Item implements IPurchasable {
	protected String itemType;
	protected int price;
	public static Random rand = new Random();
	
	@Override
	public void isPurchasable() {
		System.out.println(itemType + " ist für " + price + " Goldstücke kaufbar.");
	} 
	
}
