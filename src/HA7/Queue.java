package HA7;

public class Queue {
	
	public static void main(String[] args) {
		int[] input = Terminal.askIntArray("Queue:\n");
		int index;
		while((index = indexOfMax(input)) != -1) {
			Terminal.println(input[index]);
			input[index] = Integer.MIN_VALUE;
		}
	}
	
	public static int indexOfMax(int[] arr) {
		if(arr.length == 0) return -1;
		if(arr.length == 1) return 0;
		int max = 0;
		for(int i = 1; i < arr.length; i++) if(arr[i] > arr[max]) max = i;
		if(arr[max] == Integer.MIN_VALUE) return -1;
		return max;
	}
	
}