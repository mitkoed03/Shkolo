package pack;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[(n%2 == 0 ? n/2 : n/2 + 1)];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int[] b = new int[n/2];
		for(int c = 0; c < b.length; c++) {
			b[c] = sc.nextInt();
		}
		
		for(int c = 0; c < a.length - 1; c++) {
			int max = c;
			
			for(int cnt = c + 1; cnt < a.length; cnt++) {
				max = (a[max] > a[cnt] ? max : cnt);
			}
			
			int temp = a[max];
			a[max] = a[c];
			a[c] = temp;
		}
		
		for(int c = 0; c < b.length - 1; c++) {
			int min = c;
			
			for(int cnt = c + 1; cnt < b.length; cnt++) {
				min = (b[min] < b[cnt] ? min : cnt);
			}
			
			int temp = b[min];
			b[min] = b[c];
			b[c] = temp;
		}
		
		for(int e : a) {
			System.out.print(e + " ");
		}
		for(int e : b) {
			System.out.print(e + " ");
		}
		
		sc.close();
	}

}
