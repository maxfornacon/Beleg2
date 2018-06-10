package fantasy;

import java.util.LinkedList;
import java.util.List;

public abstract class Store {
	protected String name;
	protected List<Item> range = new LinkedList<Item>();
	
	public void getName() {
		System.out.println(name);
	}
	
	public boolean buyItem(Player player, int nr) {
		if (player.bank >= range.get(nr).price) {
			player.backpack.add(range.get(nr));
			
			player.bank -= range.get(nr).price;
			range.remove(nr);
			return true;
		} else {
			return false;
		}
	}
	public void printRange() {
		int counter = 0;
		System.out.println(name + ":");
		for (Item item : range) {
			counter++;
			System.out.print("	(" + counter + ") ");
			item.isPurchasable();
		}

	}
}
