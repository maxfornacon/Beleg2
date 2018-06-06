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
			blacksmith.range.add(Weapon.create());
			jeweler.range.add(Ring.create());
			bookstore.range.add(Scroll.create());
		}
		
		System.out.println("Was möchtest du tun?");
		System.out.println("	(1) Inventar öffnen \n	(2) Einkaufen");
		for (int i = 0; i < 1; i++ ) {
			System.out.print(">");
			switch (input.nextInt()) {
			case 1 :
				if (player.backpack.size() == 0) {
					System.out.println("Dein Inventar ist leer!");
				}
				break;
			case 2:
				System.out.println("SCHMIEDE:");
				for (Item weapon : blacksmith.range) {
					
					weapon.isPurchasable();
				}
				System.out.println("\nJUWELIER:");
				for (Item ring : jeweler.range) {
					ring.isPurchasable();
				}
				System.out.println("\nBUCHHANDLUNG:");
				for (Item scroll : bookstore.range) {
					scroll.isPurchasable();
				}
				break;
			default:
				System.out.println("Ungültige Eingabe!");
			}
			i--;
		}
		
		
		/*blacksmith.buyItem(player, 2);
		System.out.println(player.bank);
		for (int i = 0; i < player.backpack.size(); i++) {
			System.out.println(player.backpack.get(i).itemType);
		}*/
		
	}

}
