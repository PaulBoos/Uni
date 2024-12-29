package HA5;

public class Duplicate {
	
	public static void main(String[] args) {
		int x = 50, y = 30, tmp = 0;
		tmp = calc(x, y, getInput());
		tmp = calc(x, tmp, getInput());
		tmp = calc(tmp, tmp, getInput());
		System.out.println("Result: " + tmp);
	}
	
	public static int getInput() {
		int x = Terminal.askInt("Enter next value: ");
		System.out.println("Your choice was: " + x + ". Well done!");
		return x;
	}
	
	public static int calc(int a, int b, int c) {
		return (int) ((1.01 * a + 1.77 * (b - 10) + 1.22 * c) / 3);
	}
	
}