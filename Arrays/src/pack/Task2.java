package pack;

import java.util.Scanner;

public class Task2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int min = 0;
		for(int c = 1; c < a.length; c++) {
			min = (a[c] < a[min] ? c : min);
		}
		
		if(min != 0) {
			n = a[min];
			a[min] = a[0];
			a[0] = n;
		}
		
		min = 1;
		for(int c = 2; c < a.length; c++) {
			min = (a[c] < a[min] ? c : min);
		}
		
		System.out.print(a[0] + a[min]);
		
		sc.close();
	}
}
