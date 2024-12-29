package HA5;

public class Alter {
	
	public static void main(String[] args) {
		String s1 = "Als Fritz 2 Jahre alt war, war sein Bruder Heinz halb so alt. Gib Fritz aktuelles Alter ein, und erfahre wie alt Heinz jetzt ist.",
				s2 = "Heinz ist jetzt %d Jahre alt.";
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.printf(s1);
		int i = s.nextInt();
		System.out.printf(s2, i - 1);
	}
	
}
