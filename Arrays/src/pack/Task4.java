package pack;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете големината на 1-вия масив:");
		int n = sc.nextInt();
		
		System.out.println("Въведете числата на първия масив.");
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		System.out.println("Въведете големината на 2-рия масив:");
		int m = sc.nextInt();
		
		System.out.println("Въведете числата на втория масив.");
		int[] b = new int[m];
		for(int c = 0; c < b.length; c++) {
			b[c] = sc.nextInt();
		}
		
		int[] mrg = new int[m + n];
		
		for(int c = 0; c < mrg.length; c++) {
			if(c < (m < n ? m : n)*2 - 1) {
				if(c%2 == 0) {
					mrg[c] = a[c/2];
				}else {
					mrg[c] = b[c/2];
				}
			}else {
				if(m < n) {
					mrg[c] = a[c - m];
				}else {
					mrg[c] = b[c - n];
				}
			}
		}
		
		for(int e : mrg) {
			System.out.print(e + " ");
		}
		
		sc.close();
	}

}
