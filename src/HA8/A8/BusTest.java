package HA8.A8;

public class BusTest {
	
	public static void main(String[] args) {
		Bus[] busse = new Bus[]{
				new Bus("U Testdorf", "S+U Hauptbahnhof"),
				new Bus("Teststraße", "S Ostkreuz"),
				new Bus("Musterstraße", "Ligusterweg")
		};
		busse[0].fahren(10);
		busse[1].fahren(12);
		busse[2].fahren(25);
		busse[0].print();
		busse[1].print();
		busse[2].print();
	}
	
}
