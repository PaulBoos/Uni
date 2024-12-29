package HA6;

public class Loops {
	
	public static void main(String[] args) {
		for(; true; ) {
			int i = getCount();
			if(i <= 0) {
				System.exit(0);
			}
			countdown(i);
		}
	}
	
	public static void countdown(int c) {
		while(c > 0) {
			Terminal.println(c);
			c--;
		}
		Terminal.println("Start!");
	}
	
	public static int getCount() {
		return Terminal.askInt("Countdown:\n");
	}
	
}