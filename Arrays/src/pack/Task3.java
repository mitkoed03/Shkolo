package pack;

import java.util.Scanner;

public class Task3 {

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
		
		String fin = "";
		for(int e : a) {
			for(int el : b) {
				if(e == el) {
					fin += e + " ";
					break;
				}
			}
		}
		
		System.out.println(fin);
		
		sc.close();
	}
}
