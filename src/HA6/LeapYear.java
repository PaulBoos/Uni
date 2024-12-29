package HA6;

public class LeapYear {
	
	public static void main(String[] args) {
		int i = Terminal.askInt("Bitte Jahreszahl eingeben. ");
		Terminal.print(
				(i % 400 == 0 || (!(i % 100 == 0) && i % 4 == 0) ?
						"Das Jahr %d ist ein Schaltjahr." :
						"Das Jahr %d ist kein Schaltjahr.").formatted(i)
		);
	}
	
}