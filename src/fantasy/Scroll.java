package fantasy;

public class Scroll extends Item{
	public static Item create() {
		switch (rand.nextInt(2)) {
		case 0:
			return new Curse();
		case 1:
			return new EyesOfHypno();
		default:
			System.out.println("Fehler in rand");	
			return null;
		}
	}
}
