package pack;

import java.util.Scanner;

public class Task1C {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int mult = 1;
		n = 0;
		for(int e : a) {
			if(e%2 != 0) {
				mult *= e;
				n++;
			}
		}
		
		double gAvg = Math.pow((double) mult, (double) 1/n);
		int i = 0;
		
		for(int c = 1; c < a.length; c++) {
			if(Math.abs(a[i] - gAvg) > Math.abs(a[c] - gAvg)) {
				i = c;
			}
		}
		
		System.out.println(gAvg);
		System.out.println(a[i]);
		
		sc.close();
	}

}
