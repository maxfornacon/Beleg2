package fantasy;

import java.util.LinkedList;
import java.util.List;

public class Player {
	public String name;
	public int bank;
	public int power;
	public List<Item> backpack = new LinkedList<Item>();
	
	public Player(String name) {
		power = 1;
		bank = 1000;
		this.name = name;
	}
	
	public void openBackpack() {
		int counter = 0;
		for (Item item : backpack) {
			counter++;
			System.out.print("	(" + counter + ") ");
			System.out.println(item.itemType);
		}
	}
}
