package fantasy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hallo Abenteurer, bitte gib deinen Namen ein >");
		Player player = new Player(input.nextLine());
		System.out.println("Sei gegrüßt, " + player.name + "!");
		
		Blacksmith blacksmith = new Blacksmith();
		for (int i = 0; i < 10; i++) {
			blacksmith.range.add(Item.create());
		}
		
		blacksmith.buyItem(player, 2);
		System.out.println(player.bank);
		for (int i = 0; i < player.backpack.size(); i++) {
			System.out.println(player.backpack.get(i).itemType);
		}
		
	}

}
