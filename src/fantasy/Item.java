package fantasy;

public abstract class Item implements IPurchasable {
	protected String itemType;
	protected String price;
	
	@Override
	public void isPurchasable() {
		System.out.println(itemType + " ist f�r " + price + " Goldst�cke kaufbar.");
	}
	
	public static Item create() {
		return null;
		
	}
}
