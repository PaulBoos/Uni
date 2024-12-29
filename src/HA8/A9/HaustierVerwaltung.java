package HA8.A9;

public class HaustierVerwaltung {
	public static void main(String[] args) {
		// deklariere zwei Variablen vom Typ Haustier
		Haustier chinchilla;
		Haustier weissbauchigel;
		
		// erzeuge zwei Objekte der Klasse Haustier
		chinchilla = new Haustier("Fips", 5);
		weissbauchigel = new Haustier("Freddy", 2);
		
		
		// weise einigen Attributen der zwei Objekte Werte zu
		weissbauchigel.gewicht = 0.016;
		chinchilla.gewicht = 2.4;
		
		// chinchilla wird ein Jahr aelter
		chinchilla.geburtstag();
		System.out.println(chinchilla.name + " ist jetzt " + chinchilla.alter);
		System.out.println("Zusammengerechnet sind unsere Haustiere jetzt " + Haustier.alterGesamt + " Jahre alt");
		// Ausgabe der Attributwerte der Objekte
		if(chinchilla.istSaeugetier) {
			System.out.println("Der Chinchilla ist ein Sauegetier und ist" + chinchilla.alter + " Jahre alt, heisst " + chinchilla.name + ". Sie wiegt " + chinchilla.gewicht + " kg.");
		}
		System.out.println("Der Weissbauchigel ist " + weissbauchigel.alter + " Jahre alt und heisst " + weissbauchigel.name + ". Er wiegt " + weissbauchigel.gewicht + " kg.");
	}
}