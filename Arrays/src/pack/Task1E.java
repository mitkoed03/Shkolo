package pack;

import java.util.Scanner;

public class Task1E {
	
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
		
		n = 0;
		for(int c = 0; c < a.length; c++) {
			if(a[c] != max) {
				n++;
			}
		}
		int[] b = new int[n];
		
		n = 0;
		for(int c = 0; c < a.length; c++) {
			if(a[c] != max) {
				b[n] = a[c];
				n++;
			}
		}
		
		int scnd = b[0];
		for(int c = 1; c < b.length; c++) {
			scnd = Math.max(scnd, b[c]);
		}
		
		System.out.println(scnd);
		
		sc.close();
	}

}
