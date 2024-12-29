package HA8.A8;

public class Bus {
	
	String start, ziel;
	int gefahreneStationen;
	
	public Bus(String start, String ziel) {
		this.start = start;
		this.ziel = ziel;
	}
	
	void fahren(int n) {
		gefahreneStationen += n;
	}
	
	public void print() {
		final StringBuffer sb = new StringBuffer("Bus{");
		sb.append("start='").append(start).append('\'');
		sb.append(", ziel='").append(ziel).append('\'');
		sb.append(", gefahreneStationen='").append(gefahreneStationen).append('\'');
		sb.append('}');
		System.out.println(sb.toString());
	}
}
