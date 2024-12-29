package HA8.A9;

public class Haustier {
	
	String name;
	double gewicht;
	int alter;
	static int alterGesamt;
	boolean istSaeugetier = false;
	
	void geburtstag() {
		this.alter++;
		alterGesamt++;
	}
	
	public Haustier(String name, int alter) {
		this.name = name;
		this.alter = alter;
		alterGesamt += alter;
	}
	
}
