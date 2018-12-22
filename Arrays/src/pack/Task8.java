package pack;

import java.util.Scanner;

public class Task8 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int[] b = new int[n];
		for(int c = 0; c < a.length; c++) {
			for(int e: a) {
				if(e == a[c]) {
					b[c] += 1;
				}
			}
		}
		
		int max = 0;
		for(int e : a) {
			max = Math.max(max, e);
		}
		
		if(max > (n%2 == 0 ? n/2 : n/2 + 1)) {
			System.out.println("Не");
		}
		else {
			System.out.println("Да");
		}
		
		sc.close();
	}

}
