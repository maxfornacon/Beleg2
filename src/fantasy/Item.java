package fantasy;

import java.util.Random;

public abstract class Item implements IPurchasable {
	protected String itemType;
	protected int price;
	protected String message;
	public static Random rand = new Random();
	
	
	@Override
	public void isPurchasable() {
		System.out.println(itemType + " ist für " + price + " Goldstücke erhältlich.");
	} 
	
	public void use(Player player) {
		if (itemType == "Schwert" || itemType == "Bogen") {
			for (int i = 0; i < player.power; i++) {
				System.out.println(message);
			}
		} else 
			System.out.println(message);
		if (itemType == "Silberring") {
			player.power++;
		}
	}
}
