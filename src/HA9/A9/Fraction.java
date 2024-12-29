package HA9.A9;

public class Fraction {
	
	public static void main(String[] args) {
		Fraction zweidrittel = new Fraction(2, 3);
		System.out.println(zweidrittel);
	}
	
	private int numerator, denominator;
	
	/**
	 * Gibt den größten gemeinsamen Teiler der beiden Argumente (Greatest Common Divider) zurück.
	 */
	public static int GCD(int x, int y) {
		if (y == 0) return x;
		//noinspection SuspiciousNameCombination
		return GCD(y, x % y);
	}
	
	/**
	 * Gibt das kleinste gemeinsame Vielfache der beiden Argumente (Lowest Common Multiple) zurück.
	 */
	public static int LCM(int x, int y) {
		return (x * y) / GCD(x, y);
	}
	//Beginn der Aufgabe
	/**
	 * Vollstaendig parametrisierter Konstruktor der Zaehler und Nenner
	 * uebergeben bekommt und die entsprechenden Attribute setzt.
	 * Negative Vorzeichen (Zahlen kleiner als Null) duerfen nur im Zaehler
	 * auftreten (nicht im "denominator"-Attribut).
	 * Die Uebergabe eines negativen Nenners ("denominator"-Argument) an den Konstruktor ist jedoch zulaessig.
	 * Der Konstruktor muss also den uebergebenen Nenner pruefen und sein Vorzeichen so behandeln,
	 * dass der resultierende Bruch (die Attribute) die genannte Restriktion erfüllt
	 * und der Wert des Bruchs (die Argumente) unverändert bleibt
	 * (ein negatives Vorzeichen im Nenner muss also methematisch korrekt beseitigt werden).
	 * Wird eine Null als Nenner uebergeben, so wird das entsprechende Attribut
	 * auf Eins gesetzt.
	 * Jeder erzeugte Bruch wird gekuerzt (dazu soll die entsprechende Mehode s.u. verwendet werden).
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = (numerator * denominator < 0 ? -1 : 1) * Math.abs(numerator);
		this.denominator = Math.abs(denominator != 0 ? denominator : 1);
		this.shorten();
	}
	
	/**
	 * Gibt den Nenner zurueck.
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * Gibt den Zaehler zurueck.
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Gibt den Bruch als Gleitkommazahl zurueck.
	 */
	public double toDouble() {
		return (double) numerator / (double) denominator;
	}
	
	/**
	 * Gibt einen String im Format
	 * "Zaehler/Nenner" zurueck.
	 */
	public String toString() {
		return "%d/%d".formatted(numerator, denominator);
	}
	
	/**
	 * Kuerzt (vereinfacht) den Bruch.
	 */
	public void shorten() {
		int d = GCD(numerator, denominator);
		numerator /= d;
		denominator /= d;
	}
	
	/**
	 * Erweitert (macht gleichnamig), addiert dann den uebergebenen Bruch.
	 */
	public Fraction add(Fraction f) {
		return new Fraction(
				this.numerator * f.denominator + f.numerator * this.denominator,
				this.denominator * f.denominator
		);
	}
	
	/**
	 * Multipliziert mit dem uebergebenen Bruch.
	 */
	public Fraction multiply(Fraction f) {
		return new Fraction(
				this.numerator * f.numerator,
				this.denominator * f.denominator
		);
	}
	
	/**
	 * Bildet den Kehrwert, wenn der Zaehler ungleich Null ist.
	 * Sonst wird der Bruch unveraendert zurueckgegeben.
	 */
	public Fraction reciprocal() {
		return numerator != 0 ? new Fraction(denominator, numerator) : this;
	}
	
	/**
	 * Dividiert durch den uebergebenen Bruch
	 * (unter Verwendung von Kehrwert und Multiplikation).
	 */
	public Fraction divide(Fraction f) {
		return this.multiply(f.reciprocal());
	}
	
}