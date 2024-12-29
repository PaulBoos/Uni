package HA8.A10;

import java.util.Arrays;
import java.util.Objects;

public class Sekretariat {
	
	public static boolean istVoll(Tutorium t) {
		return Arrays.stream(t.teilnehmer).allMatch(
				Objects::nonNull
		);
	}
	
	public static boolean studentAufnehmen(Tutorium t, Student st) {
		for(int i = 0; i < t.teilnehmer.length; i++) {
			if(t.teilnehmer[i] == null) {
				t.teilnehmer[i] = st;
				return true;
			}
		}
		return false;
	}
	
	
}
