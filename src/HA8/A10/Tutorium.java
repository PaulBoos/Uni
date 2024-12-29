package HA8.A10;

public class Tutorium {
	
	String tutor, fach;
	int raumNr;
	Student[] teilnehmer;
	
	public Tutorium(int kapazitaet, int raumNr, String tutor, String fach) {
		this.tutor = tutor;
		this.fach = fach;
		this.raumNr = raumNr;
		this.teilnehmer = new Student[kapazitaet];
	}
	
	public void ausgeben() {
		System.out.printf("HA8.A10.Tutorium %s bei %s in Raum %d Teilnehmer:%n", fach, tutor, raumNr);
		for(Student student : teilnehmer) {
			if(student != null) {
				student.ausgeben();
			}
		}
	}
	
}
