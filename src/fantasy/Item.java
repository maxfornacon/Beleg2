package fantasy;

public abstract class Item implements IPurchasable {
	protected String itemType;
	protected String price;
	
	@Override
	public void isPurchasable() {
		System.out.println(itemType + " ist für " + price + " Goldstücke kaufbar.");
	}
	
	public static Item create() {
		switch (3) {
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
