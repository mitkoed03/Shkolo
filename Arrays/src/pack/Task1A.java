package pack;

import java.util.Scanner;

public class Task1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int sum = 0;
		for(int e : a) {
			sum += e;
		}
		
		double avg = (double) sum / (double) n;
		int i = 0;
		
		for(int c = 1; c < a.length; c++) {
			if(Math.abs(a[i] - avg) > Math.abs(a[c] - avg)) {
				i = c;
			}
		}
		
		System.out.println(avg);
		System.out.println(a[i]);
		
		sc.close();
	}

}