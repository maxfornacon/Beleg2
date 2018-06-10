package fantasy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hallo Abenteurer, bitte gib deinen Namen ein >");
		Player player = new Player(input.nextLine());
		System.out.println("Sei gegrüßt, " + player.name + "!");
		
		Blacksmith blacksmith = new Blacksmith();
		Jeweler jeweler = new Jeweler();
		Bookstore bookstore = new Bookstore();
		
		for (int i = 0; i < 5; i++) {
			blacksmith.range.add(Weapon.create(player));
			jeweler.range.add(Ring.create());
			bookstore.range.add(Scroll.create());
		}
		
		System.out.println("Was möchtest du tun?");
		System.out.println("	(1) Rucksack öffnen \n	(2) Einkaufen");
		System.out.print(">");
		for (int i = 0; i < 1; i++ ) {
			switch (input.nextInt()) {
			case 1 :
				if (player.backpack.size() == 0) {
					System.out.println("Dein Rucksack ist leer!");
				} else {
					player.openBackpack();
					System.out.print(">");
					player.backpack.get(input.nextInt() - 1).use(player);
				}
				break;
			case 2:
				System.out.println("Dein Geldbeutel beinhaltet " + player.bank + " Goldstücke.");
				System.out.println("Du hast folgende Möglichkeiten zum Einkaufen:");
				System.out.println("	(1) Schmiede\n	(2) Juwelier\n	(3) Buchhandlung");
				System.out.print(">");
				switch (input.nextInt()) {
				case 1:
					blacksmith.printRange();
					System.out.print(">");
					if(blacksmith.buyItem(player, input.nextInt() - 1)) {
						System.out.println("Glückwunsch zum Kauf!");
					} else {
						System.out.println("Du hast nicht genug Gold!");
					}
					break;
				case 2:
					jeweler.printRange();
					System.out.print(">");
					if(jeweler.buyItem(player, input.nextInt() - 1)) {
						System.out.println("Glückwunsch zum Kauf!");
					}
					break;
				case 3:
					bookstore.printRange();
					System.out.print(">");
					if(bookstore.buyItem(player, input.nextInt() - 1)) {
						System.out.println("Glückwunsch zum Kauf!");
					}
					break;

				default:
					System.out.println("Ungültige Eingabe!");
					break;
				}
				break;
			default:
				System.out.println("Ungültige Eingabe!");
			}
			System.out.print("(1) Rucksack (2) Kaufen >");
			i--;
		}
		
		
		
		
	}

}
