package HA8.A10;

public class Student {
	
	String name;
	int matrikelnummer;
	
	public Student(String name, int matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}
	
	void ausgeben() {
		System.out.printf("Matrikel Nr.: %d, Name: %s%n", matrikelnummer, name);
	}
	
}
