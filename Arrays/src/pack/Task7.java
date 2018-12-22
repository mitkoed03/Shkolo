package pack;

import java.util.Scanner;

public class Task7 {
	
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
		int k = sc.nextInt();
		
		if(k >= n) {
			System.out.println("Грешка");
			System.exit(0);
		}
		
		System.out.println("Въведете числата на втория масив.");
		int[] b = new int[k];
		for(int c = 0; c < b.length; c++) {
			b[c] = sc.nextInt();
		}
		
		n = 0;
		for(int e: b) {
			for(int el : a) {
				if(e == el) {
					n++;
					break;
				}
			}
		}
		
		if(n == k) {
			System.out.println("Да");
		}
		else {
			System.out.println("Не");
		}
		
		sc.close();
	}

}
