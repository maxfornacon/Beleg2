package fantasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Player {
	public String name;
	public int bank;
	public int power;
	public List<Item> backpack = new LinkedList<Item>();
	
	public Player(String name) {
		Random rand = new Random();
		power = rand.nextInt(3) + 1;
		bank = 1000;
		this.name = name;
	}
}
