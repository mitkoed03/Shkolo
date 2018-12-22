package pack;

import java.util.Scanner;

public class Task1D {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int max = a[0];
		for(int c = 1; c < a.length; c++) {
			max = Math.max(max, a[c]);
		}
		
		int min = a[0];
		for(int c = 1; c < a.length; c++) {
			min = Math.min(min, a[c]);
		}
		
		System.out.printf("Max:%s Min:%s Diff:%s", max, min, max - min);
		
		sc.close();
	}

}
