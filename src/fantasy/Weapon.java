package fantasy;

public class Weapon extends Item {
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
