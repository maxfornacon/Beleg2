package fantasy;

public class Weapon extends Item {
	public static Item create(Player player) {
		switch (rand.nextInt(2)) {
		case 0:
			return new Sword(player);
		case 1:
			return new Bow();
		default:
			System.out.println("Fehler in rand");	
			return null;
		}
	}
}
