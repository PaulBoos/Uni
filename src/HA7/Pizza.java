package HA7;

public class Pizza {
	
	static final int salamipreis = 550, veggiepreis = 430;
	
	public static void main(String[] args) {
		Terminal.println("Willkommen! Bestellung:\n");
		int salami = 0, veggie = 0;
		boolean ende = false;
		while(!ende) {
			int choice = Terminal.askInt("'1' Salami Pizza 5.50Euro\n" +
										 "'2' Veggi Pizza 4.30Euro\n" +
										 "'3' Ende\n");
			switch(choice) {
				case 1 -> {
					salami++;
					Terminal.println("Salami Pizza hinzugefuegt.\n");
				}
				case 2 -> {
					veggie++;
					Terminal.println("Veggi Pizza hinzugefuegt.\n");
				}
				case 3 -> ende = true;
			}
		}
		int distance = Terminal.askInt("Bitte Lieferentfernung [km] eingeben:\n");
		int preis = salami * salamipreis + veggie * veggiepreis;
		int rabatt = (distance <= 2 || distance >= 20 ? 10 : 0) + (preis >= 2000 ? 20 : preis >= 1000 ? 10 : 0);
		int endpreis = preis * (100 - rabatt) / 100;
		Terminal.println("Rabatt: %d%%".formatted(rabatt));
		Terminal.println("Endpreis: %d.%dEuro".formatted(endpreis / 100, (endpreis % 10 == 0 ? endpreis % 100 / 10 : endpreis % 100)));
	}
	
}
