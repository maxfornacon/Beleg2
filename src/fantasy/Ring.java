package fantasy;

public class Ring extends Item {
		public static Item create() {
		switch (rand.nextInt(2)) {
		case 0:
			return new goldRing();
		case 1:
			return new silverRing();
		default:
			System.out.println("Fehler in rand");	
			return null;
		}
	}

}
